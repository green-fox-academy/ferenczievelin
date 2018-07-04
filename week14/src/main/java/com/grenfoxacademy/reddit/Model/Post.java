package com.grenfoxacademy.reddit.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
    Timestamp timestamp;
    Long score;

}
