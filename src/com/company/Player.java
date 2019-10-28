package com.company;

import gui_fields.GUI_Player;

public class Player {
    String name;
    public Account acc = new Account();

    //Oliver To use in GUI
    GUI_Player guiPlayerObj;

    public Player (String name, int dieSize){
        this.name = name;
        Die die1 = new Die(dieSize);
        Die die2 = new Die(dieSize);

        // Oliver To use in GUI
        this.guiPlayerObj = new GUI_Player(this.name);
    }

    // Oliver: To use in GUI
    public GUI_Player getGuiPlayerObj() {
        return this.guiPlayerObj;
    }

    public int[] roll(){ // FIXME: 25-10-2019 Make this use the 2 Die objects to roll 2 random numbers between 1 and dieSize

        int[] res = new int[2];
        res[0] = 1; res[1] = 2;
        return (res);
    }

    public int getBalance(){ return acc.getBalance(); }

    public void setBalance(int val){
        acc.addBalance(val);
    }
}
