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
        int min = 0; int max = 7; int rollNum = 10000;

        Player player = new Player("name");
        int[] dice = player.roll();
        boolean limit = true;

        for(int count = 0; count < rollNum; count++){
            for(int i = 0; i < dice.length; i++){
                if(dice[i] < min || dice[i] > max){
                    limit = false;
                    break;
                }else if(!limit){ break; }
            }
        }
        assertTrue(limit);
    }
}