package com.greenfoxacademy.foxy.Repository;

import com.greenfoxacademy.foxy.Model.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class Repo {

    public ArrayList<Fox> foxes = new ArrayList<Fox>();
    public static Fox currentFox;


    public void saveFox(Fox fox) {
        foxes.add(fox);
    }
}
