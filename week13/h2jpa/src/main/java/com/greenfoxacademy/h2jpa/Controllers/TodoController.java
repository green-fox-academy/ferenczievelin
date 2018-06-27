package com.greenfoxacademy.h2jpa.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
    @RequestMapping("/todo")
    public String todo(Model model) {
        model.addAttribute("this is my first todo");
        return "index";
    }

}
