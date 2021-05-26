package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class SoftwareTest {

    Software s1 = new Software(true, 25);

    @Test
    public void blockApp() {
        assertEquals("", s1.getBlockedApp());

        Software s2 = new Software(true, 25);
        s2.blockApp("Steam");
        s2.blockApp("Word");
        assertEquals("Steam Word ", s2.getBlockedApp());
    }

    @Test
    public void clearBlockedApp() {
        s1.blockApp("Porn");
        s1.clearBlockedApp();
        assertEquals("", s1.getBlockedApp());
    }

    @Test
    public void getCountBlockedApps() {
        s1.blockApp("DOOM");
        s1.blockApp("GTA-V");
        assertEquals(2, s1.getCountBlockedApps());
    }

    @Test
    public void licenceTest()
    {
        Software s2 = new Software(false, 25);

        s2.blockApp("Steam");
        s2.blockApp("Word");
        s2.blockApp("DOOM");
        s2.blockApp("Quake");
        s2.blockApp("Twitch");
        s2.blockApp("Spotify");

        assertEquals("Steam Word DOOM Quake Twitch -Upgrade to a Pro licence- ", s2.getBlockedApp());
    }
}