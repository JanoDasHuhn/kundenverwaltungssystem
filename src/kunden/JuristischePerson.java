package kunden;

import Bestellung.Adresse;
import Bestellung.Bestellung;

import java.util.Arrays;
import java.util.List;

public class JuristischePerson extends Kunde{
    private Boolean isKapitalgesellschaft;
    private Adresse lieferadresse;

    public JuristischePerson(String name, Adresse adresse, List<Bestellung> bestellungen,  boolean isKapitalgesellschaft, Adresse lieferadresse){
        super(name,adresse,bestellungen);
        this.isKapitalgesellschaft = isKapitalgesellschaft;
        this.lieferadresse = lieferadresse;

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
    public void ergänzeBestellung(Bestellung...  bestellung) {
        bestellungen.addAll(Arrays.asList(bestellung));

    }

    @Override
    public int wichtigkeit() {
        int score = 10;
        if(isKapitalgesellschaft){
            score += 5;
        }
        if(isPremiumkunde()){
            score +=10;
        }
        for (Bestellung bestellung : bestellungen){
            score += 2;
        }

        return score;
    }

    @Override
    public void setPremiumkunde(boolean premiumkunde) {
        super.setPremiumkunde(premiumkunde);
    }
}
