package PrijsInvloeden;

public class Koers implements  IKoers {
    double koers;
    String naam;
    public Koers(double koers){
        this.koers = koers;
    }

    public void setKoers(double koers) {
        this.koers = koers;
    }

    @Override
    public double getKoers() {
        return koers;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }
}
