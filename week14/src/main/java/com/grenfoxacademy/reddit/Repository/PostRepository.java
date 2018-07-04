package com.grenfoxacademy.reddit.Repository;

import com.grenfoxacademy.reddit.Model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
