package com.greenfoxacademy.h2jpa.Repository;

import com.greenfoxacademy.h2jpa.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {

}
