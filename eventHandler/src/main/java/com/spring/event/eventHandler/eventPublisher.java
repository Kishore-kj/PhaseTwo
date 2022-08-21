package com.spring.event.eventHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class eventPublisher {
  
	@Autowired
	Listener listener;
	
	//ZEE Studios
	public void streamValimai(String movieID) {
		System.out.println("Zee Prime Streaming Valimai "+movieID);
		
		listener.watchValimai(movieID);
	}
}
