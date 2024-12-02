package kunden;

import Bestellung.Adresse;
import Bestellung.Bestellung;

import java.util.List;

abstract class Kunde {
    protected String name;
    protected Adresse adresse;
    protected List<Bestellung> bestellungen;






    public abstract Adresse lieferePostanschrift();

    protected boolean isPremiumkunde;

    public Kunde(String name,Adresse adresse,List<Bestellung> bestellungen){
        this.name = name;
        this.adresse = adresse;

        this.bestellungen = bestellungen;

    }


    public abstract void ergänzeBestellung(Bestellung... bestellung);

    public List<Bestellung> getBestellungen() {
        return bestellungen;
    }
    public abstract int wichtigkeit();

    public Adresse getAdresse() {
        return adresse;
    }



    public String getName() {
        return name;
    }

    public boolean isPremiumkunde() {
        return isPremiumkunde;
    }

    public void setPremiumkunde(boolean premiumkunde) {
        isPremiumkunde = premiumkunde;
    }
}
