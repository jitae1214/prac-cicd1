package com.example.prac_cicd1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloContoroller {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
