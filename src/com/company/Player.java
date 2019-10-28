package com.company;

import gui_fields.GUI_Player;

public class Player {
    String name;
    Account acc = new Account();

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

    /*public int[] roll(){ // FIXME: 25-10-2019 Make this use the 2 Die objects to roll 2 random numbers between 1 and dieSize
        
        return ([1, 2])
    }*/

}
