package com.spring.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/adminn")
    public String admin(){
        return "Hello World from admin";
    }
    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hello World, i was protected";
    }

    

}