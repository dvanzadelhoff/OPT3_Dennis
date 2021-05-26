package com.company;

public class Users {

    private String naam;
    private int leeftijd;
    private boolean versie;
    private boolean actief;
    private String systeem;

    public Users(String naam, int leeftijd, boolean versie, boolean actief, String systeem)
    {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.versie = versie;
        this.actief = actief;
        this.systeem = systeem;
    }

    public String getNaam()
    {
        return this.naam;
    }

    public int getLeeftijd()
    {
        return this.leeftijd;
    }

    public boolean isVersie()
    {
        return this.versie;
    }

    public boolean isActief()
    {
        return this.actief;
    }

    public String getSysteem()
    {
        return this.systeem;
    }

    public Double berekenPrijs()
    {
        Double prijs = 5.0;

        if (this.versie)
        {
            prijs = 10.0;

            if (this.leeftijd <= 21)
            {
                prijs = prijs - 2.0;
            }

            if (this.leeftijd >= 65)
            {
                prijs = prijs - 1.0;
            }
        }

        if (this.systeem == "MacOs")
        {
            prijs = prijs + 3;
        }

        return prijs;
    }

}
