package org.example.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/home")
    public String home() {
        return "Привет, дом";
    }

    @GetMapping("/world")
    public String world() {
        return "Привет, мир";
    }
}
