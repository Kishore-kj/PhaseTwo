package com.junit.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Assertion {

	public boolean checkAge(int age) {
		return age >= 18;
	}
	
	@Test
	public void testAsserions() {
		assertEquals(6, 4+2);
		assertNotEquals(7,4+3);
	}

	@Test
	@DisplayName("Test exception using lambda")
	public void testThrow() {
		assertThrows(RuntimeException.class, ()->
		{throw new RuntimeException("not valid") ;});
		
	}
}
