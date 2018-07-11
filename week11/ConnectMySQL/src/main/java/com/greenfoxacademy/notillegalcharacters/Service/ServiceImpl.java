package com.greenfoxacademy.notillegalcharacters.Service;

import com.greenfoxacademy.notillegalcharacters.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements TodoService {


    private final TodoRepo todoRepo;

    @Autowired
    public ServiceImpl(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }
}
