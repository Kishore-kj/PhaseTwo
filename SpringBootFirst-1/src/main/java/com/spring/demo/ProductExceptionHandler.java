package com.spring.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.reactive.ClientHttpResponseDecorator;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {

	@ExceptionHandler(value = ProductNotFound.class)
	public ResponseEntity<Object> handleExceptionEntity(ProductNotFound e){
		return new ResponseEntity<Object>("Not Found "+e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
