package com.grenfoxacademy.reddit.Service;

import com.grenfoxacademy.reddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl {

    private final PostRepository postrepository;

    @Autowired 
    public PostServiceImpl (PostRepository postRepository) {
        this.postrepository = postRepository;
    }
}
