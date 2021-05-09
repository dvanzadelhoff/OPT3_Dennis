package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {
    Users dennis = new Users("dennis", 20, true, true, "MacOs");

    @Test
    public void berekenPrijsTest()
    {
        assertEquals(11.0, dennis.berekenPrijs(), 0.0001);
    }
}
