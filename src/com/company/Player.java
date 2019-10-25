package com.company;

public class Player {
    String name;
    Account acc = new Account();

    public Player (String name, int dieSize){
        this.name = name;
        Die die1 = new Die(dieSize);
        Die die2 = new Die(dieSize);
    }
    
    public int[] roll(){ // FIXME: 25-10-2019 Make this use the 2 Die objects to roll 2 random numbers between 1 and dieSize
        
        return ([1, 2])
    }

}
