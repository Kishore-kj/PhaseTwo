package com.spring.demo;

import java.util.Arrays;

public class ProductNotFound extends RuntimeException{

	public ProductNotFound(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
		
	}

	@Override
	public String toString() {
		return "ProductNotFound [not found with id 0] ";
	}
	
}
