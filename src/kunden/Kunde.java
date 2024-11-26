package kunden;

 abstract class Kunde {
    protected String name;
    protected String adresse;
    protected int bisherigesBestellvolumen;
    protected int anzahlBestellungen;
    protected int ID;




    public abstract String lieferePostanschrift();

    public abstract boolean isPremiumkunde();

    public Kunde(String name,String adresse,int bisherigesBestellvolumen,int anzahlBestellungen,int ID){
        this.name = name;
        this.adresse = adresse;
        this.bisherigesBestellvolumen = bisherigesBestellvolumen;
        this.anzahlBestellungen = anzahlBestellungen;
        this.ID = ID;
    }
}
