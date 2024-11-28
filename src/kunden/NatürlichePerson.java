package kunden;

import Bestellung.Adresse;

public class NatürlichePerson extends Kunde{

    public NatürlichePerson(String name, Adresse adresse, int bisherigesBestellvolumen, int anzahlBestellungen, int ID) {
        super(name, adresse, bisherigesBestellvolumen, anzahlBestellungen, ID);
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
