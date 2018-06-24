package hu.greenfoxacademy.springstart.Controllerz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounter {
    AtomicLong id = new AtomicLong(0);

    @RequestMapping("/web/greeting")
    public String greeting (Model userName, Model userId, @RequestParam("name")String name) {
        id.incrementAndGet();
        userName.addAttribute("name", name);
        userId.addAttribute("id",id);
        return "greeting";
    }

}
