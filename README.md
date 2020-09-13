# Healthcare Program

  This application is a spring boot micro-service. 
  It holds a eureka registry which manages a micro-service called service.
  
  Application contains solutions for two problems,
  
    1) **Problem 1:**
		Given a string _s_, find the longest palindromic substring in _s_. You may assume that the maximum
		length of _s_ is 1000.
		
		**Solution?:**
		Write a Spring Boot micro-service that completes the following:
		1. Receives string input over an API
		2. Stores the longest palindrome in provided database
		3. Retrieves the stored palindrome over an API
		You should be able to run your micro-service locally and use an API client (such as PostMan) to test your
		results.
	
	2) Problem 2/Solution?:
		Have the function BinaryReversal(str) take the str parameter being passed, which will be a positive
		integer, take its binary representation (padded to the nearest N * 8 bits), reverse that string of bits, and
		then finally return the new reversed string in decimal form. For example: if str is &quot;47&quot; then the binary
		version of this integer is 101111 but we pad it to be 00101111. Your program should reverse this binary
		string which then becomes: 11110100 and then finally return the decimal version of this string, which is
		244.
  
## How to run
 
 1) Maven install 
 
    mvn -U clean install
    
 2) Run eureka-registry as a spring boot application and launch following url in the browser
 
    http://localhost:8006
 
    Eureka server dashboard will be shown
    
 3) Run service as a spring boot application and refresh eureka server dashboard, observe one micro-service with service will be shown.
 
 
## Test application

 1) Launch swagger-url to test Palindrome
 
    http://localhost:8007/swagger-ui.html#/palindrome-controller
 
 2) Launch swagger-url to test Binary Reversal
    
    http://localhost:8007/swagger-ui.html#/binary-reversal-controller
    
 2) Used h2 db to test the functionality, following are the db details
 
    - Launch following url for h2 client, http://localhost:8007/h2-console/   and fill in below details,
    - Driver Class : org.h2.Driver
    - Jdbc Url :    jdbc:h2:mem:testdb
    - Username : sa
    - Password : password
    
    