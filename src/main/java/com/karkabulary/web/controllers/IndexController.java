package com.karkabulary.web.controllers;

import com.karkabulary.web.countdown.CountdownService;
import com.karkabulary.web.definition.DefinitionService;
import com.karkabulary.web.definition.MockDefinitionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class IndexController {
    private static final AtomicInteger viewCount = new AtomicInteger();

    @GetMapping
    public String index(Model model){
        final DefinitionService definitionService = new MockDefinitionService();
        final var definitions = definitionService.getDefinitions();

        final CountdownService countdownService = new CountdownService();
        final var countdowns = countdownService.getCountdowns();

        model.addAttribute("viewCount", viewCount.incrementAndGet());
        model.addAttribute("definitions", definitions);
        model.addAttribute("countdowns", countdowns);
        return "index.html";
    }
}
