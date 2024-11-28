import Bestellung.Adresse;
import Bestellung.Bestellung;
import kunden.JuristischePerson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JuristischePerson siemens = new JuristischePerson("siemens",new Adresse("Altschauerberg 8","Emskirchen",14772),new ArrayList<Bestellung>(),1,true,"Hauptstraße 8");

    }
}