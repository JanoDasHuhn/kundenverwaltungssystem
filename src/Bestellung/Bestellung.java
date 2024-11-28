package Bestellung;

import java.util.HashMap;

public class Bestellung {
    private HashMap<Artikel,Integer> artikelAndAmountHashMap;

    public Bestellung(){
        artikelAndAmountHashMap = new HashMap<Artikel, Integer>();
    }
    public void fuegeArtikelhinzu(Artikel artikel,int anzahl){
        artikelAndAmountHashMap.put(artikel,anzahl);
    }
    public void entferneArtikel(Artikel artikel){
        artikelAndAmountHashMap.remove(artikel);
    }

    public HashMap<Artikel, Integer> getArtikelAndAmountHashMap() {
        return artikelAndAmountHashMap;
    }
}
