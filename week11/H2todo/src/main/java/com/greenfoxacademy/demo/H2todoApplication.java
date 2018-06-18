package com.greenfoxacademy.demo;

import com.greenfoxacademy.demo.Models.Todo;
import com.greenfoxacademy.demo.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2todoApplication implements CommandLineRunner {
    private final
    TodoRepository todoRepository;
    @Autowired
    public H2todoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(H2todoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("wake up",true,true));
        todoRepository.save(new Todo("drink coffee",true,true));
        todoRepository.save(new Todo("Don't die",true,true));
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        
    }
}
