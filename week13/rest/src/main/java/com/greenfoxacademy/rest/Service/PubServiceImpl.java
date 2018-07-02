package com.greenfoxacademy.rest.Service;

import com.greenfoxacademy.rest.Model.Pub;
import com.greenfoxacademy.rest.Repo.FirstRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PubServiceImpl implements PubService {


    private final FirstRepo firstRepo;



    @Autowired
    public PubServiceImpl(FirstRepo firstRepo) {
        this.firstRepo = firstRepo;
    }

    @Override
    public List<Pub> getAllPub() {
        return null;

    }

    @Override
    public void addGif(Pub gifToAdd) {

    }
}
