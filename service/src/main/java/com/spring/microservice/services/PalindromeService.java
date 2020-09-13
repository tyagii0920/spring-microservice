package com.spring.microservice.services;

import java.util.List;

import com.spring.microservice.entities.PalindromeSubstring;

public interface PalindromeService {
	
	PalindromeSubstring findLongestPalindromSubstring(String input);
	
	List<PalindromeSubstring> getAll();
	
}
