package com.greenfoxacademy.notillegalcharacters.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Boolean isUrgent;
    private Boolean isDone;
    private LocalDate date;

    public Todo(String title, Boolean isUrgent, Boolean isDone, LocalDate date) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.date = LocalDate.now();
    }

    public Todo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getUrgent() {
        return isUrgent;
    }

    public void setUrgent(Boolean urgent) {
        isUrgent = urgent;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
