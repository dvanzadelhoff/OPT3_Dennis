package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class randwaardeTest
{

    @Test
    public void noProLicenceTest()
    {
        Software np = new Software(false, 1);
        assertEquals(5.0, np.berekenAanschafPrijs(), 0.001);
    }

    @Test
    public void ProLicenceTests()
    {
        Software p0 = new Software(true, 0);
        assertEquals(8.0, p0.berekenAanschafPrijs(), 0.001);

        Software p20 = new Software(true, 20);
        assertEquals(8.0, p20.berekenAanschafPrijs(), 0.001);

        Software p21 = new Software(true, 21);
        assertEquals(8.0, p21.berekenAanschafPrijs(), 0.001);

        Software p22 = new Software(true, 22);
        assertEquals(10.0, p22.berekenAanschafPrijs(), 0.001);

        Software p64 = new Software(true, 64);
        assertEquals(10.0, p64.berekenAanschafPrijs(), 0.001);

        Software p65 = new Software(true, 65);
        assertEquals(9.0, p65.berekenAanschafPrijs(), 0.001);

        Software p66 = new Software(true, 66);
        assertEquals(9.0, p66.berekenAanschafPrijs(), 0.001);
    }

}