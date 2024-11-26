package kunden;

public class JuristischePerson extends Kunde{
    private Boolean isKapitalgesellschaft;
    private String lieferadresse;
    public JuristischePerson(String name, String adresse,int bisherigesbestellvolumen,int anzahlbestellungen,int ID,boolean isKapitalgesellschaft,String lieferadresse){
        super(name,adresse,bisherigesbestellvolumen,anzahlbestellungen,ID);
        this.isKapitalgesellschaft = isKapitalgesellschaft;
        this.lieferadresse = lieferadresse;

    }

    @Override
    public String lieferePostanschrift() {
        return "";
    }

    @Override
    public boolean isPremiumkunde() {
        return false;
    }
}
