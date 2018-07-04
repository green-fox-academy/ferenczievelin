package com.grenfoxacademy.reddit.Controller;

import com.grenfoxacademy.reddit.Service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    private final PostServiceImpl postService;

    @Autowired
    public PostController (PostServiceImpl postService) {
        this.postService = postService;
    }

}
