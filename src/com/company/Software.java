package com.company;

public class Software {

    //een overzicht met alle geblokkeerde apps
    private String blockedApp = "";

    //houd het aantal geblokkeerde apps bij
    private int countBlockedApps;

    //dit houd bij of de software gebruikt word door iemand met een pro of een trial licence
    private boolean hasProLicence;

    private int AanschafLeeftijd;

    public Software(boolean hasProLicence, int aanschafLeeftijd)
    {

        this.hasProLicence = hasProLicence;
        this.AanschafLeeftijd = aanschafLeeftijd;

    }

    //blokkeer een app
    public void blockApp(String appName)
    {
        if (!this.hasProLicence && this.countBlockedApps >= 5)
        {
            blockedApp += "-Upgrade to a Pro licence- ";
        }

        else {
            blockedApp += appName + " ";
            countBlockedApps++;
        }
    }

    //maak de lijst met geblokkeerde apps leeg
    public void clearBlockedApp()
    {
        blockedApp = "";
        countBlockedApps = 0;
    }

    //laat de geblokkeerde apps zien
    public String getBlockedApp()
    {
        return this.blockedApp;
    }

    public double berekenAanschafPrijs()
    {
        if (this.getHasProlicence())
        {
            double prijs = 10.0;

            if (this.getAanschafLeeftijd() <= 21)
            {
                return prijs - 2.0;
            }

            else if (this.getAanschafLeeftijd() >= 65)
            {
                return prijs - 1.0;
            }

            return prijs;
        }
        else
        {
            return 5.0;
        }
    }

    //geeft het aantal geblokkeerde app weer
    public int getCountBlockedApps()
    {
        return this.countBlockedApps;
    }

    //geeft weer of de licence pro is of niet
    public boolean getHasProlicence()
    {
        return this.hasProLicence;
    }

    public int getAanschafLeeftijd()
    {
        return this.AanschafLeeftijd;
    }

}
