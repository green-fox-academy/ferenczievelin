package com.greenfoxacademy.foxy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String information() {
        return "index";};

    @GetMapping(value = "/login")
    public String name() {
        return "login";};

}

