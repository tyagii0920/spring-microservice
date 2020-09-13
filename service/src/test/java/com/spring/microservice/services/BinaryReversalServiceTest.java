package com.spring.microservice.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryReversalServiceTest {
	
	private BinaryReversalServiceImpl binaryReversalServiceImpl;
	
	@Before
	public void setup() {
		binaryReversalServiceImpl = new BinaryReversalServiceImpl();
	}
	
	@Test
	public void testBinaryReversal() {
		Assert.assertEquals("244", binaryReversalServiceImpl.getBinaryReversal(47));
	}

}
