package com.greenfoxacademy.h2jpa.Controllers;

import com.greenfoxacademy.h2jpa.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    private final TodoRepo todoRepo;

    @Autowired
    public TodoController(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }


    @RequestMapping("/todo")
    public String todo(Model model) {
        model.addAttribute("todos", todoRepo.findAll());
        return "index";
    }

}
