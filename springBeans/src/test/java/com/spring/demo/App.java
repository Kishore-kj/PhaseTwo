package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("obj");
		obj.display();

		Student obj1 = (Student) context.getBean("s1");
		System.out.println("ID " + obj1.getId() + " Name " +obj1.getName());
		
		Marks m = obj1.getMarks();
		
		

	}

}
