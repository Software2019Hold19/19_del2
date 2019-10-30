package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void getBalance() {
        Account account = new Account();
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testNegative() {
        Account account = new Account();
        int bal = account.getBalance() + 1;
        account.addBalance(-bal);
        assertEquals(0, account.getBalance());
    }
}