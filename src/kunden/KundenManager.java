package kunden;

import Bestellung.Bestellung;

import java.lang.reflect.Array;
import java.util.*;

import Bestellung.Adresse;
import Bestellung.ArtikelManager;

public class KundenManager {
    private ArrayList<JuristischePerson> juristischeKunden;
    private ArrayList<NatürlichePerson> natürlicheKunden;
    private ArtikelManager artikelManager;
    public KundenManager(ArtikelManager artikelManager){
        juristischeKunden = new ArrayList<>();
        natürlicheKunden = new ArrayList<>();
        this.artikelManager = artikelManager;


    }
    public JuristischePerson createJuristischePerson(String name, boolean isKapitalgesellschaft, List<Bestellung> bestellungen, Adresse adresse, Adresse lieferadresse){
        JuristischePerson juristischePerson = new JuristischePerson(name,adresse, bestellungen,isKapitalgesellschaft,lieferadresse);
        juristischeKunden.add(juristischePerson);
        return juristischePerson;
    }
    public NatürlichePerson createNatürlichePerson(String name,List<Bestellung> bestellungen,Adresse adresse){
        NatürlichePerson natürlichePerson = new NatürlichePerson(name,adresse,bestellungen);
        natürlicheKunden.add(natürlichePerson);
        return natürlichePerson;
    }


    public JuristischePerson getJuristischePeron(int ID){
        return juristischeKunden.get(ID);
    }

    public NatürlichePerson getNatürlichePerson(int ID){
        return natürlicheKunden.get(ID);
    }


    private List<Integer> wichtigkeitsranking(){
        List<Integer> wichtigkeitsListe = new ArrayList<>();
        for (NatürlichePerson natürlichePerson : natürlicheKunden){
            wichtigkeitsListe.add(natürlichePerson.wichtigkeit());
        }
        for (JuristischePerson juristischePerson : juristischeKunden){
            wichtigkeitsListe.add(juristischePerson.wichtigkeit());
        }
        wichtigkeitsListe.sort(Collections.reverseOrder());
        return wichtigkeitsListe;
    }
    public void printTop10Kunden() {
        ArrayList<JuristischePerson> juristischeKundenTemp = new ArrayList<>(juristischeKunden);
        ArrayList<NatürlichePerson> natürlicheKundenTemp = new ArrayList<>(natürlicheKunden);
        int i1 = 0;
        System.out.println("Top 10 Kunden");
        for (Integer i : wichtigkeitsranking()) {


            List<JuristischePerson> zuEntfernenJuristische = new ArrayList<>();
            for (JuristischePerson juristischePerson : juristischeKundenTemp) {

                if (juristischePerson.wichtigkeit() == i && i1 != 9) {
                    System.out.println("KundenName: " + juristischePerson.getName() + " | Wichtigkeit: " + juristischePerson.wichtigkeit());
                    zuEntfernenJuristische.add(juristischePerson);
                    i1 ++;
                }
            }
            juristischeKundenTemp.removeAll(zuEntfernenJuristische);

            List<NatürlichePerson> zuEntfernenNatürliche = new ArrayList<>();
            for (NatürlichePerson natürlichePerson : natürlicheKundenTemp) {

                if (natürlichePerson.wichtigkeit() == i && i1 != 9) {
                    System.out.println("KundenName: " + natürlichePerson.getName() + " | Wichtigkeit: " + natürlichePerson.wichtigkeit());
                    zuEntfernenNatürliche.add(natürlichePerson);
                    i1++;
                }
            }
            natürlicheKundenTemp.removeAll(zuEntfernenNatürliche);
        }
    }

    public void setupBestellungen(){
            Bestellung bestellung = new Bestellung();
            bestellung.fuegeArtikelhinzu(artikelManager.getArtikel(1),1);
            bestellung.fuegeArtikelhinzu(artikelManager.getArtikel(2),2);
            for (NatürlichePerson natürlichePerson : natürlicheKunden){
                int länge = new Random().nextInt(20);

                for (int i = länge; i > 0; i--){

                    natürlichePerson.ergänzeBestellung(bestellung);
                }

        }
            for (JuristischePerson juristischePerson : juristischeKunden){
                int länge = new Random().nextInt(20);
                for (int i = länge; i > 0; i--){
                    juristischePerson.ergänzeBestellung(bestellung);
                }

            }

    }

}
