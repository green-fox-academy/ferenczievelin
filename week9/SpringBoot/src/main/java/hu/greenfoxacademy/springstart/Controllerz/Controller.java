package hu.greenfoxacademy.springstart.Controllerz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class Controller {
    private String name;
    @GetMapping("/cicak")
    @ResponseBody
    public ArrayList<String> getCicaNames () {
        return new ArrayList<>(Arrays.asList(
                "cirmi",
                "garfield"
        ));
    }



}
