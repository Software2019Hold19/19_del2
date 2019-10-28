package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void name() {
        Player player = new Player("name");
        assertEquals("name", player.name);
    }

    @Test
    public void guiPlayerObj() {
        Player player = new Player("name");
        assertEquals("name", player.guiPlayerObj.getName());
    }

    @Test
    public void testRoll() {
        Player player = new Player("name");
        int[] dice = player.roll();
        boolean limit = true;

        for(int count = 0; count < 1000; count++){
            for(int i = 0; i < dice.length; i++){
                if(dice[i] < 0 && dice[i] > 7){
                    limit = false;
                    break;
                }else if(!limit){ break; }
            }
        }
        assertTrue(limit);
    }
}