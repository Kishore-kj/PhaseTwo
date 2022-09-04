package com.junit.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {

	@BeforeAll
	public static void beforeAll() {
		
		System.out.println("Before ALl");
	}
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each");
	}
	
	@Test
	public void testOne() {
		System.out.println("This is my firt test");
	}
	
	@Test
	public void testTwo() {
		System.out.println("This is my two test");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After each");
	
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After all");
	}
}
