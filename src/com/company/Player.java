package com.company;

public class Player {
    String name;
    Account acc = new Account();

    public Player (String name, int dieSiza){
        this.name = name;
        Die die1 = new Die(dieSiza);
        Die die2 = new Die(dieSiza);
    }

}
