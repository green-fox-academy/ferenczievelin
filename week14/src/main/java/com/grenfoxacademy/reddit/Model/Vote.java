package com.grenfoxacademy.reddit.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vote {
    @Id
    @GeneratedValue
    Long id;
    User user;
    Post post;
    int voteValue;
}
