package hu.greenfoxacademy.springstart.Controllerz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model @RequestParam) {
        model.addAttribute("name", " World");
        return "greeting";
    }
}

