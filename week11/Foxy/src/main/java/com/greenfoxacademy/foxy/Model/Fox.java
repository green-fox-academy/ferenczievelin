package com.greenfoxacademy.foxy.Model;

import java.util.List;

public class Fox {
   private String name;
   private   List<String> tricks;
   private Food food;
   private Drink drink;

    enum Food {
        pizza, salad, nachos, rakottkrumpli, toltottkaposzta
    }

    enum Drink {
        wine, vodka, rum, pinaColada, mohito, coffe
    }

    public Fox(String name) {
        this.name = name;
    }

    public Fox() {
        this.name = "fixfox";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }


}