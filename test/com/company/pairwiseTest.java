package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class pairwiseTest {
    @Test
    public void pairwiseTesting1() {
        Users test1 = new Users("Dennis1", 20, false, true, "Windows");
        assertEquals(5.0, test1.berekenPrijs(), 0.001);

        Users test2 = new Users("Dennis2", 21, true, false, "MacOs");
        assertEquals(11.0, test2.berekenPrijs(), 0.001);

    }

    @Test
    public void pairwiseTesting2() {
        Users test1 = new Users("Barend1", 22, false, false, "MacOs");
        assertEquals(8.0, test1.berekenPrijs(), 0.001);

        Users test2 = new Users("Barend2", 64, true, true, "Windows");
        assertEquals(10.0, test2.berekenPrijs(), 0.001);
    }

    @Test
    public void pairwiseTesting3() {
        Users test1 = new Users("andre1", 65, false, false, "Windows");
        assertEquals(5.0, test1.berekenPrijs(), 0.001);

        Users test2 = new Users("andre2", 66, true, true, "MacOs");
        assertEquals(12.0, test2.berekenPrijs(), 0.001);
    }
}