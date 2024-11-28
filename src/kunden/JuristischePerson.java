package kunden;

import Bestellung.Adresse;

public class JuristischePerson extends Kunde{
    private Boolean isKapitalgesellschaft;
    private Adresse lieferadresse;
    public JuristischePerson(String name, Adresse adresse,int bisherigesbestellvolumen,int anzahlbestellungen,int ID,boolean isKapitalgesellschaft,String lieferadresse){
        super(name,adresse,bisherigesbestellvolumen,anzahlbestellungen,ID);
        this.isKapitalgesellschaft = isKapitalgesellschaft;
        this.lieferadresse = adresse;

    }

    @Override
    public Adresse lieferePostanschrift() {
        return adresse;
    }

    @Override
    public boolean isPremiumkunde() {
        return false;
    }
}
