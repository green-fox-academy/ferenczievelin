package com.grenfoxacademy.reddit.Repository;

import com.grenfoxacademy.reddit.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.sql.rowset.CachedRowSet;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
}
