package hu.greenfoxacademy.springstart.Controllerz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    private static final String hello = "Hello, %s!";
    private final AtomicLong id = new AtomicLong();

    @RequestMapping("/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name ) {
        return new Greeting (id.incrementAndGet(),
                String.format(hello, name));


    }



}
