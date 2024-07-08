package Kleding;

import VoorraadProcessor.IVoorraad;

public class Hoodie extends Kleding implements IHoodie{
    public Hoodie(String naam, String merkNaam, int prijs, KledingType type) {
        super(naam, merkNaam, prijs, type);
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
