package com.spring.firstDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       
       Vehicle obj = (Vehicle) context.getBean("Vehicle");
       obj.drive();
    }
}
