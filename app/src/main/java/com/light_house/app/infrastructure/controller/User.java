package com.light_house.app.infrastructure.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class User {
    // This class can be used to define user-related endpoints and logic.
    // For example, you might have methods for creating, updating, deleting, and retrieving users.
    
    @GetMapping("/user/{userId}")
    public Mono<String> getUserDetails(@PathVariable(value = "userId") String userId) {
        
        return Mono.just("User details for userId: " + userId);
    }
    
    // Additional methods can be added as needed
}
