package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DieTest {
    @Test
    public void testRoll() {
        int min = 1; int max = 6; int rollNum = 10000;
        boolean limit = true;
        Die die = new Die();

        for(int i = 0; i < rollNum; i++){
            int num = die.roll();
            if(num < min || num > max){
                limit = false;
                break;
            }
        }
        assertTrue(limit);
    }
}