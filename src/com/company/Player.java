package com.company;

import gui_fields.GUI_Player;
import jdk.jshell.execution.JdiDefaultExecutionControl;


public class Player {
    String name;
    public Account acc = new Account();
    Die die1 = new Die();
    Die die2 = new Die();

    //Oliver To use in GUI
    GUI_Player guiPlayerObj;

    public Player (String name){
        this.name = name;


        // Oliver To use in GUI
        this.guiPlayerObj = new GUI_Player(this.name);
    }

    // Oliver: To use in GUI
    public GUI_Player getGuiPlayerObj() {
        return this.guiPlayerObj;
    }

    // FIXME: 25-10-2019 Make this use the 2 Die objects to roll 2 random numbers between 1 and dieSize

    public int[] roll(){

        int[] res = new int[2];
        res[0] = this.die1.roll();
        res[1] = this.die2.roll();
        return (res);
    }

    public int getBalance(){ return acc.getBalance(); }

    public void setBalance(int val){
        acc.addBalance(val);
    }
}
