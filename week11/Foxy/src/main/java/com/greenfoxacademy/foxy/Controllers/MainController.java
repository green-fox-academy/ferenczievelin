package com.greenfoxacademy.foxy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String information() {
        return "index";
    }

    ;

    @GetMapping(value = "/login")
    public String name() {
        return "login";
    }

    ;

    @PostMapping
    public String login(@RequestParam(value = "name") String name) {
        return "redirect:/?name=" + name;
    }
}

