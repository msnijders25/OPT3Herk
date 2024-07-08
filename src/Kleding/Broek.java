package Kleding;

import VoorraadProcessor.IVoorraad;

import java.util.ArrayList;

public class Broek extends Kleding implements IBroek{

    public Broek(String naam, String merk, int prijs, KledingType kledingType){
        super( naam, merk, prijs,KledingType.BROEK);

    }
    @Override
    public IVoorraad getVoorraad() {
        return null;
    }

    @Override
    public int getBasisPrijs() {
        return 0;
    }

    @Override
    public void setVoorraad(int i) {

    }

    @Override
    public void setBasisPrijs(double nieuwePrijs) {

    }

}
