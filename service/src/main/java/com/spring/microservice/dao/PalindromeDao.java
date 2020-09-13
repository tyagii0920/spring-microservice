package com.spring.microservice.dao;

import java.util.List;

import com.spring.microservice.entities.PalindromeSubstring;

public interface PalindromeDao {
	
	PalindromeSubstring savePalindrome(PalindromeSubstring palindromeSubString);
	
	List<PalindromeSubstring> getAll();

}
