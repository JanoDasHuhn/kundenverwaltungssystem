import java.util.ArrayList;

public class KundenverwaltungssystemManager {
    private ArrayList<Integer> FreundeVomChef;


    public KundenverwaltungssystemManager(){
        FreundeVomChef = new ArrayList<Integer>();

    }
    public boolean isFreundvomChef(int ID){
        return FreundeVomChef.contains(ID);
    }
}
