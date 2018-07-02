package com.greenfoxacademy.rest.Service;

import com.greenfoxacademy.rest.Model.Pub;

import java.util.List;

public interface PubService {
    List<Pub> getAllPub();
    void addGif(Pub gifToAdd);
}
