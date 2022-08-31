package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootFirst3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirst3Application.class, args);
	}

}
