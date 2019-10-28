package com.company;

import java.awt.*;
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

    public void setFieldText(int fieldNumber, String txt)
    {
        board.getFields()[fieldNumber].setSubText(txt);
    }

    public void setFieldTitle(int fieldNumber, String txt)
    {
        board.getFields()[fieldNumber].setTitle(txt);
    }

    public void setFieldDescription(int fieldNumber, String txt)
    {
        board.getFields()[fieldNumber].setDescription(txt);
    }

 //   public void setBackgroundColor(int fieldNumber, String txt)
 //   {
 //       board.getFields()[fieldNumber].setBackGroundColor(Color.getColor(""));
 //   }

    public String getPlayerDropbown(java.lang.String msg, java.lang.String... buttons)
    {
        return board.getUserSelection(msg,buttons);
    }

    //Methods to use with gui user input and msg
    // board.getUserString(String)
    //      .getUserButtonPressed(java.lang.String msg, java.lang.String... buttons)
    //      .board.getUserSelection(java.lang.String msg, java.lang.String... options);
    //      .showMessage(java.lang.String msg)


}
