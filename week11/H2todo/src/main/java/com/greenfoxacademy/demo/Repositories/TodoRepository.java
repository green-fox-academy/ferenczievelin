package com.greenfoxacademy.demo.Repositories;

import com.greenfoxacademy.demo.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository <Todo, Long> {
}
