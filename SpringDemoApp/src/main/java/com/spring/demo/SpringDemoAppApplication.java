package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.demo")
public class SpringDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoAppApplication.class, args);
	}

}
