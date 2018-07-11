package com.greenfoxacademy.notillegalcharacters.Repository;

import com.greenfoxacademy.notillegalcharacters.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository <Todo, Long> {
}
