package com.grenfoxacademy.reddit.Controller;

import com.grenfoxacademy.reddit.Model.Post;
import com.grenfoxacademy.reddit.Service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    private final PostServiceImpl postService;

    @Autowired
    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/posts")
    public List<Post> addPost(@RequestBody Post post) {
        postService.addPost(post);
        return (List<Post>) postService.getAllPosts();
    }

    @PutMapping("/posts/{id}/upvote")
    public List<Post> upVotePost(@PathVariable Long id) {
        postService.increaseScoreOfPost(id);
        return postService.getAllPosts();
    }

    @PutMapping("/posts/{id}/downvote")
    public List<Post> downVotePost(@PathVariable Long id) {
        postService.decreaseScoreOfPost(id);
        return postService.getAllPosts();
    }



}
