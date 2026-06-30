package com.sanjana.placementportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @GetMapping("/welcome")
    public String hello(){
        return "Hello Sanjana";
    }

    @GetMapping("/intro")
    public String intro(){
        return "I am studying Springboot";
    }

    @GetMapping("/name")
    public String name(){
        return "I am Sanjana. I am a college student .";
    }
}
