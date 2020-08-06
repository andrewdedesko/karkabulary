package com.karkabulary.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfrastructureController {
    @GetMapping("/_ah/warmup")
    public String warmup(){
        return "Hello";
    }
}
