package kunden;

import Bestellung.Adresse;
import Bestellung.Bestellung;

import java.util.List;

public class JuristischePerson extends Kunde{
    private Boolean isKapitalgesellschaft;
    private Adresse lieferadresse;
    public JuristischePerson(String name, Adresse adresse, List<Bestellung> bestellungen, int ID, boolean isKapitalgesellschaft, String lieferadresse){
        super(name,adresse,bestellungen,ID);
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

    @Override
    public void ergänzeBestellung(Bestellung bestellung) {
        bestellungen.add(bestellung);

    }
}
