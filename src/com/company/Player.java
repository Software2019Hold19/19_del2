package com.company;

public class Player {
    String name;
    Account acc = new Account();

    public Player (String name, int dieSize){
        this.name = name;
        Die die1 = new Die(dieSize);
        Die die2 = new Die(dieSize);
    }

}
