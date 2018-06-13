package hu.greenfoxacademy.springstart.Controllerz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWorldController {
  //  private static final String hello = "Hello, %s!";
    AtomicLong counter = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam("name") String name) {
        model.addAttribute("name", name);
        model.addAttribute("id", counter.incrementAndGet());
        return "greeting";
    }
}

