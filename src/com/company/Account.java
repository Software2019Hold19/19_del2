package com.company;

public class Account {
    private int balance = 1000;

    public Account(){
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int val) { // FIXME: 23-10-2019 Cannot go below 0!!
        this.balance += val;
    }
}
