package hu.greenfoxacademy.springstart.Controllerz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
    private String  string;

    Greeting greeting = new Greeting();

    String greet () {
        return "hi";
    }

@RequestMapping ("/hi");

}
