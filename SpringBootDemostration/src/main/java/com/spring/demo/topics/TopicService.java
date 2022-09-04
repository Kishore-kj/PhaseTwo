package com.spring.demo.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService{

	private List<Topic> topics = Arrays.asList( 
            new Topic("spring","Spring framework","Srping framework description"),
            new Topic("java","java framework" ,"java framework description")
            );
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
