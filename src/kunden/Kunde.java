package kunden;

import Bestellung.Adresse;

abstract class Kunde {
    protected String name;
    protected Adresse adresse;
    protected int bisherigesBestellvolumen;
    protected int anzahlBestellungen;
    protected int ID;




    public abstract Adresse lieferePostanschrift();

    public abstract boolean isPremiumkunde();

    public Kunde(String name,Adresse adresse,int bisherigesBestellvolumen,int anzahlBestellungen,int ID){
        this.name = name;
        this.adresse = adresse;
        this.bisherigesBestellvolumen = bisherigesBestellvolumen;
        this.anzahlBestellungen = anzahlBestellungen;
        this.ID = ID;
    }
}
