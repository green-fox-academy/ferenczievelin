package hu.greenfoxacademy.springstart.Controllerz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    private long id;
    private String content;

    public Greeting() {
        this(0,"defaultcontent" );
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }



    @RequestMapping ("/hello")

    public String hello () {
        return "hello world";
    }


}
