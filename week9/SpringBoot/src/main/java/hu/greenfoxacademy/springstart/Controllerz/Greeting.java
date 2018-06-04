package hu.greenfoxacademy.springstart.Controllerz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    private long id;
    private String content;

    @RequestMapping ("/hello")

    public String hello () {
        return "hello world";
    }


}
