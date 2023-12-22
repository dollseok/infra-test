package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello")
    public String hello2(){
        return "hello2";
    }
}
