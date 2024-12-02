package Bestellung;

import kunden.JuristischePerson;
import kunden.NatürlichePerson;

import java.util.ArrayList;
import java.util.Objects;

public class ArtikelManager {
    private ArrayList<Artikel> artikels;
    public ArtikelManager(){
        artikels = new ArrayList<>();
    }
    public Artikel getArtikel(int ID){
        for (Artikel artikel: artikels){
            if (artikel.getArtikelnummer() == ID){
                return artikel;
            }
        }
        return new Artikel("FALSCHER ARTIKEL",88888888);
    }
    public Artikel getArtikel(String name){
        for (Artikel artikel: artikels){
            if(Objects.equals(artikel.getArtikelName(), name)){
                return artikel;
            }

        }
        return new Artikel("FALSCHER ARTIKEL",88888888);
    }
    public Artikel createArtikel(String name){
        int id = artikels.size();
        Artikel artikel = new Artikel(name,id);
        artikels.add(artikel);
        return artikel;

    }


    public void printealleArtikelinKunde(JuristischePerson kunde){

        for (Bestellung bestellung1 : kunde.getBestellungen()){
            System.out.println("Bestellung: ");
            printeAlleBestellungen(bestellung1);
        }
    }
    public  void printealleArtikelinKunde(NatürlichePerson kunde ){
        for (Bestellung bestellung1 : kunde.getBestellungen()){
            System.out.println("Bestellung: ");
            printeAlleBestellungen(bestellung1);
        }

    }
    private void printeAlleBestellungen(Bestellung bestellung){
        for (Artikel artikel : artikels){
            if(bestellung.getArtikelAndAmountHashMap().containsKey(artikel)){
                System.out.println("Artikel: " + artikel.getArtikelName() + " " + artikel.getArtikelnummer() + " | Menge: " + bestellung.getArtikelAndAmountHashMap().get(artikel));
            }
        }
    }

}
