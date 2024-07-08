package PrijsProcessor;

import Kleding.IKleding;
import Kleding.Prijs;
import Observer.PrijsObserver;
import PrijsInvloeden.IKoers;

import java.util.ArrayList;

public class PrijsProcesserMand extends PrijsProcesser {
    protected ArrayList<Prijs> prijzen;
    protected IKleding kleding;
    boolean isKoersAlToegepast = false;
    // iskoersAlToegepast heeft de functie om te verkomen dat de koers berekening niet op de al bewerkte prijs de berekening doet
    protected IKoers ikoers;
    protected ArrayList<PrijsObserver> observers = new ArrayList<>();
    private boolean isSaleAlToegepast;

    public PrijsProcesserMand(IKoers koers, IKleding ikleding) {
        super();
        this.ikoers = koers;
        this.prijzen = new ArrayList<>();
        this.kleding = ikleding;

    }

    @Override
    public Prijs loadEindPrijs() {

        loadPrijzen();
        applyKoers();
        loadPrijzenMetTax();
        Prijs prijs = new Prijs(kleding.getId(), kleding.getBasisPrijs());
        return prijs;
    }

    @Override
    public void setIkoers(IKoers ikoers) {
        this.ikoers = ikoers;
    }


    @Override
    protected void selectKleding() {

    }


    @Override
    protected void loadPrijzen() {
    }

    ;

    @Override
    protected void applyKoers() {
        if (isKoersAlToegepast = false) {
            kleding.setBasisPrijs(kleding.getBasisPrijs() * ikoers.getKoers());
        }
        isKoersAlToegepast = true;
    }

    protected void applySale() {
        if (isSaleAlToegepast = false) {
            for (Prijs prijs : prijzen) {
                double nieuwePrijs = prijs.getPrijs();
                prijs.setPrijs(nieuwePrijs * ikoers.getKoers());
            }
            isKoersAlToegepast = true;
        }
    }

    @Override
    protected void loadPrijzenMetTax() {
        kleding.setBasisPrijs(kleding.getBasisPrijs() * 1.20);

    }


    private void notificatie() {
        for (PrijsObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void addObserver(PrijsObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PrijsObserver observer) {
        observers.remove(observer);
    }
}
