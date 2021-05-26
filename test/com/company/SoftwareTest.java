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
        Software t011 = new Software(true, 25);
        t011.blockApp("Steam");
        t011.blockApp("Word");
        t011.blockApp("DOOM");
        t011.blockApp("Quake");
        t011.blockApp("Twitch");
        t011.blockApp("Spotify");

        assertEquals("Steam Word DOOM Quake Twitch Spotify ", t011.getBlockedApp());

        Software t101 = new Software(false, 25);
        t101.blockApp("Steam");
        t101.blockApp("Word");
        t101.blockApp("DOOM");

        assertEquals("Steam Word DOOM ", t101.getBlockedApp());

        Software t110 = new Software(false, 25);
        t110.blockApp("Steam");
        t110.blockApp("Word");
        t110.blockApp("DOOM");
        t110.blockApp("Quake");
        t110.blockApp("Twitch");

        t110.clearBlockedApp();

        assertEquals("", t110.getBlockedApp());

        Software t111 = new Software(false, 25);
        t111.blockApp("Steam");
        t111.blockApp("Word");
        t111.blockApp("DOOM");
        t111.blockApp("Quake");
        t111.blockApp("Twitch");
        t111.blockApp("Spotify");

        assertEquals("Steam Word DOOM Quake Twitch -Upgrade to a Pro licence- ", t111.getBlockedApp());
    }
}