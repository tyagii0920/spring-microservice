package com.spring.microservice.repos;

import org.springframework.data.repository.CrudRepository;

import com.spring.microservice.entities.PalindromeSubstring;

public interface PalindromeSubstringRepository extends CrudRepository<PalindromeSubstring, Long> {

}
