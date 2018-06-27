package com.greenfoxacademy.h2jpa.Repository;

import com.greenfoxacademy.h2jpa.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {

}
