package com.karkabulary.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class IndexController {
    private static final AtomicInteger viewCount = new AtomicInteger();

    @GetMapping
    public String index(Model model){
        model.addAttribute("viewCount", viewCount.incrementAndGet());
        return "index.html";
    }
}
