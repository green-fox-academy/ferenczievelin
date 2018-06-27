package com.greenfoxacademy.h2sql;

import com.greenfoxacademy.h2sql.Model.Todo;
import com.greenfoxacademy.h2sql.Repos.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2sqlApplication implements CommandLineRunner {

    private final
    TodoRepo todoRepo;

    @Autowired
    public H2sqlApplication(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }
    public static void main(String[] args) {
        SpringApplication.run(H2sqlApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        todoRepo.save(new Todo("I have to learn Object Relational Mapping", true, true ));

    }
}