package com.grenfoxacademy.reddit.Service;

import com.grenfoxacademy.reddit.Model.Post;
import com.grenfoxacademy.reddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postrepository;

    @Autowired 
    public PostServiceImpl (PostRepository postRepository) {
        this.postrepository = postRepository;
    }

    @Override
    public List<Post> getAllPosts() {
        return (List<Post>) postrepository.findAll();
    }

    @Override
    public void addPost(Post post) {

    }

    @Override
    public void update(Post post) {

    }

    @Override
    public void delete(Long id) {

    }
}
