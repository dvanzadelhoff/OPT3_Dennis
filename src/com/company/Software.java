package com.company;

public class Software {

    //een overzicht met alle geblokkeerde apps
    private String blockedApp;

    //houd het aantal geblokkeerde apps bij
    private int countBlockedApps;

    //dit houd bij of de software gebruikt word door iemand met een pro of een trial licence
    private boolean hasProLicence;

    public Software()
    {

    }

    //blokkeer een app
    public void blockApp()
    {

    }

    //maak de lijst met geblokkeerde apps leeg
    public void clearBlockedApp()
    {

    }

    //laat de geblokkeerde apps zien
    public String getBlockedApp()
    {
        return this.blockedApp;
    }

    //geeft het aantal geblokkeerde app weer
    public int getCountBlockedApps()
    {
        return 0;
    }

    //geeft weer of de licence pro is of niet
    public boolean getHasProlicence()
    {
        return this.hasProLicence;
    }

}
