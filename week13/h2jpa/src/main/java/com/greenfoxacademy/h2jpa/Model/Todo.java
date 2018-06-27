package com.greenfoxacademy.h2jpa.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Todo {
    @Id
    @GeneratedValue
    Long id;
    String title;
    boolean urgent;
    boolean done;


}
