package kunden;

import Bestellung.Adresse;
import Bestellung.Bestellung;

import java.util.Arrays;
import java.util.List;

 public class NatürlichePerson extends Kunde{

    public NatürlichePerson(String name, Adresse adresse, List<Bestellung> bestellungen) {
        super(name, adresse, bestellungen);
    }

    @Override
    public Adresse lieferePostanschrift() {
        return adresse;
    }

    @Override
    public boolean isPremiumkunde() {
        return isPremiumkunde;
    }

    @Override
    public void ergänzeBestellung(Bestellung... bestellung) {
        bestellungen.addAll(Arrays.asList(bestellung));

    }

    @Override
    public int wichtigkeit() {
        int score = 0;
        if(isPremiumkunde()){
            score += 5;
        }
        for (Bestellung bestellung : bestellungen){
            score += 2;
        }
        return score;
    }

    public void gebeZurück(int bestellnummer){
        bestellungen.remove(bestellnummer);

    }

    @Override
    public void setPremiumkunde(boolean premiumkunde) {
        super.setPremiumkunde(premiumkunde);
    }
}
