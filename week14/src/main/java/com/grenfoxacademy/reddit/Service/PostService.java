package com.grenfoxacademy.reddit.Service;

import com.grenfoxacademy.reddit.Model.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> getAllPosts ();

    void addPost(Post post);

    void update(Post post);

    void delete(Long id);

    void increaseScoreOfPost(Long id);

    void decreaseScoreOfPost(Long id);



}
