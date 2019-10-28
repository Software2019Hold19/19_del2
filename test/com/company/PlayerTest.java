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
    public void tmp() {
    }
}