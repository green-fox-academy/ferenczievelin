package com.grenfoxacademy.reddit.Service;

import com.grenfoxacademy.reddit.Model.Post;

import java.util.List;

public interface PostService {

    List<Post> getAllPosts ();

    void addPost(Post post);

    void update(Post post);

    void delete(Long id);
}
