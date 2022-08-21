package com.spring.event.eventHandler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
       eventPublisher bean = context.getBean(eventPublisher.class);
       bean.streamValimai("1171");
    }
}
