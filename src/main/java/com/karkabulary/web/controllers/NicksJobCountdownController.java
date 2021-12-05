package com.karkabulary.web.controllers;

import com.karkabulary.web.countdown.CountdownService;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fuckcanadiantire")
public class NicksJobCountdownController {
    @GetMapping
    public String index(Model model){
        final var nicksJobCountdown = CountdownService.createCountdownDisplay("Done with Canadian Tire's bullshit in",
                DateTime.now(),
                DateTime.parse("2021-12-10T17:00:00-05"));
        model.addAttribute("nicksJobCountdown", nicksJobCountdown);
        return "nicksJobCountdown.html";
    }
}
