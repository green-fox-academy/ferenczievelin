package com.greenfoxacademy.notillegalcharacters.Controllers;

import com.greenfoxacademy.notillegalcharacters.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
}