package Kleding;


public class KledingFactory {
    public static IKleding createKleding(KledingType type, String naam, String merk, int prijs) {
        switch (type) {
            case HOODIE:
                return new Hoodie(naam, merk, prijs, type);
            case BROEK:
                return new Broek(naam, merk, prijs, type);
            case SHIRT:
                return new Shirt(naam, merk, prijs, type);
            default:
                throw new IllegalArgumentException("Onbekende kleding type");
        }
    }
}
