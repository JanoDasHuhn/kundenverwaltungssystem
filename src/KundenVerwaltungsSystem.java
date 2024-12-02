import Bestellung.Adresse;
import Bestellung.Bestellung;

import Bestellung.ArtikelManager;
import kunden.JuristischePerson;
import kunden.KundenManager;
import kunden.NatürlichePerson;


import java.util.ArrayList;

public class KundenVerwaltungsSystem {


    public static void main(String[] args) {
        ArtikelManager artikelManager = new ArtikelManager();
        artikelManager.createArtikel("Pizza");
        artikelManager.createArtikel("Burger");
        artikelManager.createArtikel("Pommes");
        artikelManager.createArtikel("Gimace Shake");
        KundenManager kundenManager = new KundenManager(artikelManager);

        System.out.println("Artikel "+  artikelManager.getArtikel("Pommes").getArtikelnummer() + " | " + artikelManager.getArtikel(3).getArtikelName());

        JuristischePerson siemens = kundenManager.createJuristischePerson("siemens",true,new ArrayList<Bestellung>(), new Adresse("Hauptstraße 1","Berlin",10176),new Adresse("Hauptstraße 2","Berlin",10176));

        Bestellung bestellung = new Bestellung();
        bestellung.fuegeArtikelhinzu(artikelManager.getArtikel(1),2);
        bestellung.fuegeArtikelhinzu(artikelManager.getArtikel(2),3);
        Bestellung bestellung1 = new Bestellung();
        bestellung1.fuegeArtikelhinzu(artikelManager.getArtikel(3),2);
        bestellung1.fuegeArtikelhinzu(artikelManager.getArtikel(2),1);
        siemens.ergänzeBestellung(bestellung,bestellung1);
        artikelManager.printealleArtikelinKunde(siemens);
        System.out.println("Rückgabetesten 1");
        NatürlichePerson rainer = kundenManager.createNatürlichePerson("Rainer",new ArrayList<Bestellung>(),new Adresse("Altschauerberg 8","Emskirchen",91448));
        rainer.ergänzeBestellung(bestellung1,bestellung,bestellung1);
        artikelManager.printealleArtikelinKunde(rainer);
        System.out.println("Rückgabetesten 2");
        rainer.gebeZurück(1);
        artikelManager.printealleArtikelinKunde(rainer);

        siemens.setPremiumkunde(true);
        rainer.setPremiumkunde(true);
        System.out.println("Kunden:");
        System.out.println(siemens.getName() + " | " + siemens.wichtigkeit());
        System.out.println(rainer.getName() + " | "+ rainer.wichtigkeit());

        siemens.setPremiumkunde(false);
        rainer.setPremiumkunde(false);
        System.out.println("Kunden:");
        System.out.println(siemens.getName() + " | " + siemens.wichtigkeit());
        System.out.println(rainer.getName() + " | "+ rainer.wichtigkeit());



        //Top Kunden Test
        kundenManager.createJuristischePerson("BMW",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Porsche",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("VW",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Toyota",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Nvidia",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Apple",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Microsoft",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Samsung",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Drygerrise",false,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Ubisoft",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("EA",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Supercell",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Nintendo",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Telekom",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("Rheinmetall",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));
        kundenManager.createJuristischePerson("McDonalds",true,new ArrayList<Bestellung>(),new Adresse("Test","Test",1),new Adresse("Test","Test",1));

        kundenManager.createNatürlichePerson("Max",new ArrayList<Bestellung>(),new Adresse("Test","Test",1));
        kundenManager.createNatürlichePerson("Tim",new ArrayList<Bestellung>(),new Adresse("Test","Test",1));
        kundenManager.createNatürlichePerson("Jordan",new ArrayList<Bestellung>(),new Adresse("Test","Test",1));

        kundenManager.setupBestellungen();
        kundenManager.printTop10Kunden();





    }





}