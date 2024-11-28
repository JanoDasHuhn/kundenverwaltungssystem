package Bestellung;

public class Artikel {
    private int artikelNummer;
    private String artikelName;

    public Artikel(String artikelname, int artikelNummer){
        this.artikelName = artikelname;
        this.artikelNummer = artikelNummer;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public String getArtikelName() {
        return artikelName;
    }
}
