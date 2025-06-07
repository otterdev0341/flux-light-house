package com.otter.lighthouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Hello, World!");
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }
}
