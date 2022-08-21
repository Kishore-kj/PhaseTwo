package com.spring.demo;

/**
 * Hello world!
 *
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	
    	HelloWorld h= (HelloWorld)context.getBean("obj");
    	h.print();
    	
    	Student s = (Student) context.getBean("s1");
    	System.out.println("ID : "+s.getId());
    	System.out.println("Name : "+s.getName());
    	
    
    }
}
