package com.company;

import java.util.ArrayList;
import java.util.Arrays;



import gui_fields.GUI_Field;
import gui_fields.GUI_Player;

import java.util.ArrayList;

public class GUI {
    gui_main.GUI board;
   // gui_fields.GUI_Player player[];
    GUI_Player guiPlayer[];

    public GUI()
    {
        this.board = new gui_main.GUI();
    }


    public void setDice(int die1, int die2)
    {
        board.setDice(die1, die2);
    }

    public void addPlayerToBoard(Player player)
    {
        board.addPlayer(player.getGuiPlayerObj());

        /*
        int count = 0;
        for (Player p : players)
        {
            ArrayList<GUI_Player> aList = new ArrayList<GUI_Player>(Arrays.asList(guiPlayer));
            aList.add(new GUI_Player(p.name));
            guiPlayer = aList.toArray();
            board.addPlayer(guiPlayer[count]);

            count++;
        }
         */
    }

    public void moveCar(int fieldNumber, Player player)
    {
        board.getFields()[fieldNumber].setCar(player.guiPlayerObj, true);
    }


}
