package com.greenfoxacademy.demo.Controllerz;

import com.greenfoxacademy.demo.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController (value = "todo")
public class WebController {

    private final
    TodoRepository todoRepository;
    @Autowired
    public WebController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }



    @GetMapping("/")
    @ResponseBody
    public String worksFine (Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "index";

    }


}
