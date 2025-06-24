package com.example.prac_cicd1;

import org.springframework.stereotype.Controller;

@Controller
public class helloContoroller {
    public String hello() {
        return "hello";
    }
}
