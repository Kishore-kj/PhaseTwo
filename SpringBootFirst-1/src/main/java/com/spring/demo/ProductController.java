package com.spring.demo;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable("id") String id) throws ProductNotFound{
		
		if(id.contentEquals("0"))
		 throw new ProductNotFound("Not valid id ");
		 else
			return "Product was found"; 
		
	}
}
