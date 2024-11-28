package kunden;

import Bestellung.Adresse;
import Bestellung.Bestellung;

import java.util.List;

public class NatürlichePerson extends Kunde{

    public NatürlichePerson(String name, Adresse adresse, List<Bestellung> bestellungen, int ID) {
        super(name, adresse, bestellungen, ID);
    }

    @Override
    public Adresse lieferePostanschrift() {
        return adresse;
    }

    @Override
    public boolean isPremiumkunde() {
        return false;
    }

    @Override
    public void ergänzeBestellung(Bestellung bestellung) {
        bestellungen.add(bestellung);

    }
    public void sendeZurücK(int bestellnummer){
        bestellungen.remove(bestellnummer);

    }
}
