package VoorraadProcessor;

import Kleding.IKleding;
import Voorraad.Voorraad;

import java.util.ArrayList;

class VoorraadRepository {
    private ArrayList<IKleding> kledingStukken;

    public VoorraadRepository(ArrayList<IKleding> kledingStukken) {
        this.kledingStukken = kledingStukken;
    }

    public IVoorraad getVoorraad(IKleding kledingstuk) {
        for (IKleding kleding : kledingStukken) {
            if (kleding == kledingstuk) {
                return kleding.getVoorraad();
            }
        }
        return null;
    }
}
public class VoorraadProcessor {
    IVoorraad voorraad;

    public void getVoorraad(IKleding kledingstuk, ArrayList<IKleding> kledingStukken){
        for(IKleding kleding: kledingStukken){
            if(kleding == kledingstuk){
                this.voorraad = kleding.getVoorraad();
            }
        }
    }

    public void bewerkVoorraad(String invoer){
        if(invoer.equals("Verhoog")){
            voorraad.setVoorraad(voorraad.getVoorraad()+ 1);
        }

        if(invoer.equals("Verlaag")){
            voorraad.setVoorraad(voorraad.getVoorraad()- 1);
        }
    }
    public void voerNieuweVoorraadIn(int invoer){
        voorraad.setVoorraad(invoer);
    }


}
