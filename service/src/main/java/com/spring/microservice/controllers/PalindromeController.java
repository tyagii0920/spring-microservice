package com.spring.microservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservice.entities.PalindromeSubstring;
import com.spring.microservice.services.PalindromeService;

@RestController
@RequestMapping("palindrome")
public class PalindromeController {

	@Autowired
	private PalindromeService palindromeService;

	@PostMapping
	public ResponseEntity<PalindromeSubstring> savePalindrome(String input) {
		return new ResponseEntity<PalindromeSubstring>(palindromeService.findLongestPalindromSubstring(input),
				HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<PalindromeSubstring>> getAll() {
		return new ResponseEntity<List<PalindromeSubstring>>(palindromeService.getAll(), HttpStatus.OK);
	}
}
