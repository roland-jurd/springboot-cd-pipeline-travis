package com.example.travis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    
    
    @GetMapping("/test")
    public String helloWorldTest() {
        return "Hello World";
    }
    
}
