package com.fadi.imhere.web.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {


    @RequestMapping("/")
    public String index() {

        return "@from Spring Bootfrom Spring Boot from Spring Boot!";
    }
    
}
