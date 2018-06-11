package com.greenfoxacademy.bankofsimba.Model;

public class BankAccount {
    String name;
    double balance;
    String type;

    public BankAccount(String name, double balance, String type) {
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    public BankAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
