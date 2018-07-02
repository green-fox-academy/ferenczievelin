package com.greenfoxacademy.rest.Repo;

import com.greenfoxacademy.rest.Model.Pub;
import org.springframework.data.repository.CrudRepository;

public interface FirstRepo extends CrudRepository <Pub, Long> {
}
