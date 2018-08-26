package com.example.travis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/travis")
public class PipelineTravisController {
    
    
    @GetMapping("/test")
    public String test() {
        return "Continuous deployment project using Travis ci";
    }
    
}
