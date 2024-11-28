package Bestellung;

import java.util.ArrayList;

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
            if(artikel.getArtikelName() == name){
                return artikel;
            }

        }
        return new Artikel("FALSCHER ARTIKEL",88888888);
    }
}
