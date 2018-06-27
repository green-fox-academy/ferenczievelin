package com.greenfoxacademy.h2jpa;

import com.greenfoxacademy.h2jpa.Model.Todo;
import com.greenfoxacademy.h2jpa.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2jpaApplication implements CommandLineRunner {

    private final
    TodoRepo todoRepo;

    @Autowired
    public H2jpaApplication(TodoRepo todoRepository) {
        this.todoRepo = todoRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(H2jpaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        todoRepo.save(new Todo("do something", true, true ));

    }
}
