package kunden;

import Bestellung.Adresse;
import Bestellung.Bestellung;

import java.util.List;

abstract class Kunde {
    protected String name;
    protected Adresse adresse;
    protected List<Bestellung> bestellungen;

    protected int ID;




    public abstract Adresse lieferePostanschrift();

    public abstract boolean isPremiumkunde();

    public Kunde(String name,Adresse adresse,List<Bestellung> bestellungen,int ID){
        this.name = name;
        this.adresse = adresse;

        this.bestellungen = bestellungen;
        this.ID = ID;
    }
}
