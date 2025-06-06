package com.light_house.app.infrastructure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    

    // This class can be used to define test-related endpoints and logic.
    // For example, you might have methods for testing various functionalities of the application.

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, this is a test endpoint!";
    }

    // Additional methods can be added as needed
}
