package com.greenfoxacademy.h2sql.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class Todo {
    @Id
    @GeneratedValue
    Long id;
    String title;
    boolean urgent;
    boolean done;


    public Todo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.done = done;
        this.urgent = urgent;
    }

    public Todo() {
    }
}
