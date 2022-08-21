package com.spring.customevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;

public class eventListener implements ApplicationListener<CustomEvent>{

	public void onApplicationEvent(CustomEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.toString());
	}
	

}
