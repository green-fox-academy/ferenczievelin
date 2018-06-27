package com.greenfoxacademy.h2sql.Repos;

import com.greenfoxacademy.h2sql.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {

}
