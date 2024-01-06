package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    @GetMapping("/")
    public String hello() {
        int a;
        a-10;
        return "Hello World";
    }
}