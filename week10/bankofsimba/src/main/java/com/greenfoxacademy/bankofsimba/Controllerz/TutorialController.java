package com.greenfoxacademy.bankofsimba.Controllerz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TutorialController {
    @RequestMapping("/hello1")
    public String hello(Model model) {
        model.addAttribute("name", "Tom");
        model.addAttribute("formatted", "<b>blue</b>");
        return "hello";
    }
}
