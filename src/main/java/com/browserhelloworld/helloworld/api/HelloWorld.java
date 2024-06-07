package com.browserhelloworld.helloworld.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class HelloWorld {
    
  
    @RequestMapping(value= "/hello")
    public String sayHello()
    {
        return "Hello World!, This is Basil withg Spring Boot";
    }
}
