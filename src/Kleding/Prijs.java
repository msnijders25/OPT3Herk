package Kleding;

public class Prijs {
    int kledingID;
    double basisPrijs;
    double geconverteerdePrijs;
    public Prijs(int kledingID, double basisPrijs){
        this.kledingID = kledingID;
        this.basisPrijs = basisPrijs;
    }

    public Prijs() {

    }

    public double getBasisPrijs() {
        return basisPrijs;
    }

    public void setGeconverteerdePrijs(double geconverteerdePrijs) {
        this.geconverteerdePrijs = geconverteerdePrijs;
    }

    public double getGeconverteerdePrijs() {
        return geconverteerdePrijs;
    }

    public int getKledingID() {
        return kledingID;
    }

    public double getPrijs() {
        return geconverteerdePrijs;
    }

    public void setPrijs(double v) {
        this.geconverteerdePrijs = v;
    }
}
