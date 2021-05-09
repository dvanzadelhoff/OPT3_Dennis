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

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public boolean isVersie() {
        return versie;
    }

    public boolean isActief() {
        return actief;
    }

    public String getSysteem() {
        return systeem;
    }

    public Double berekenPrijs() {

        Double prijs = 5.0;

        if (versie = true)
        {
            prijs = 10.0;

            if (leeftijd <= 21)
            {
                prijs = 8.0;
            }
            else if(leeftijd >= 65)
            {
                prijs = 9.0;
            }
        }

        if (systeem == "MacOs")
        {
            prijs = prijs + 3.0;
        }

        return prijs;
    }
}
