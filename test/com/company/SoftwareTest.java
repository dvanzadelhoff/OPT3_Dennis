package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class SoftwareTest {

    @Test
    public void blockApp() {
        Software s1 = new Software();
        assertEquals("", s1.getBlockedApp());

        Software s2 = new Software();
        s2.blockApp("Steam");
        s2.blockApp("Word");
        assertEquals("Steam Word ", s2.getBlockedApp());
    }

    @Test
    public void clearBlockedApp() {

    }

    @Test
    public void getBlockedApp() {
    }

    @Test
    public void getCountBlockedApps() {
    }

    @Test
    public void getHasProlicence() {
    }
}