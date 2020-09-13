package com.spring.microservice.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.microservice.entities.PalindromeSubstring;
import com.spring.microservice.repos.PalindromeSubstringRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class PalindromeDaoImpl implements PalindromeDao {
	
	@Autowired
	private PalindromeSubstringRepository palindromeRepository;
	
	@Override
	public PalindromeSubstring savePalindrome(PalindromeSubstring palindromeSubString) {
		log.info("Saving palindrome substring for {} ", palindromeSubString.getInput());
		return palindromeRepository.save(palindromeSubString);
	}

	@Override
	public List<PalindromeSubstring> getAll() {
		List<PalindromeSubstring> substrings = new ArrayList<>();
		palindromeRepository.findAll().forEach(substrings::add);
		log.info("Available substrings {}", substrings.size());
		return substrings;
	}

}
