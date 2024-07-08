package Kleding;

import VoorraadProcessor.IVoorraad;

public class Shirt extends Kleding implements IShirt{
    KledingType kledingType;

    public Shirt(String naam, String merk, int prijs, KledingType kledingType){
        super( naam, merk, prijs,KledingType.SHIRT);

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
