package com.example.workflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Conyto {

    @GetMapping("/hello")
    public String getHello() {
        return "BB i miss u";
    }
}
