package com.spring.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.customevent.CustomEvent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

     ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
     
     //Default event handling
     context.start();
     context.stop();
     
     //Custom event handling
     CustomEventPublisher
     
     
    }
}
