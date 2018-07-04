package com.grenfoxacademy.reddit.Controller;

import com.grenfoxacademy.reddit.Model.Post;
import com.grenfoxacademy.reddit.Service.PostService;
import com.grenfoxacademy.reddit.Service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    private final PostServiceImpl postService;

    @Autowired
    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @GetMapping("posts")
    public List<Post> getAllPosts () {
        return postService.getAllPosts();
    }

}
