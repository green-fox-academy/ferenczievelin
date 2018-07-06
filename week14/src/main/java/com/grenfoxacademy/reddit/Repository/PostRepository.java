package com.grenfoxacademy.reddit.Repository;

import com.grenfoxacademy.reddit.Model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}
