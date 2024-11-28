package Bestellung;

public class Adresse {
    private String straße,ort;
    private int postleitzahl;


    public Adresse(String straße,String ort,int postleitzahl){
        this.straße = straße;
        this.ort = ort;
        this.postleitzahl = postleitzahl;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public String getStraße() {
        return straße;
    }
}
