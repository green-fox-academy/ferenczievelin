package com.grenfoxacademy.reddit.Model;

import javax.persistence.Entity;

@Entity
public class Vote {
    User user;
    Post post;
    int voteValue;
}
