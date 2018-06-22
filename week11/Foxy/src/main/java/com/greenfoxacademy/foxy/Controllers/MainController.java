package com.greenfoxacademy.foxy.Controllers;

import com.greenfoxacademy.foxy.Services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

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

