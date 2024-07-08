package PrijsProcessor;

import java.util.ArrayList;
import Kleding.*;
import Observer.PrijsObserver;
import PrijsInvloeden.*;
import Observer.PrijsObserver.*;

public abstract class PrijsProcesser {
    protected IKleding kledingFactory;
    protected ArrayList<Prijs> prijzen;

    protected IKoers ikoers;
    protected ArrayList<PrijsObserver> observers = new ArrayList<>();

    Tax tax;
    Koers koers;


    public PrijsProcesser(Tax tax, Koers koers) {
        this.kledingFactory = kledingFactory;
        this.prijzen = new ArrayList<>();
        this.tax = tax;
        this.koers = koers;
    }

    public PrijsProcesser() {

    }

    public Prijs loadEindPrijs() {
        selectKleding();
        loadPrijzen();
        applyKoers();
        loadPrijzenMetTax();
        notificatie();

        Prijs prijs = new Prijs();
        return prijs;
    }

    public void setIkoers(IKoers ikoers) {
        this.ikoers = ikoers;
    }

    protected void selectKleding() {

        }


    protected abstract void loadPrijzen();

    protected void applyKoers() {
        for (Prijs prijs : prijzen) {
            double nieuwePrijs = prijs.getPrijs();
            prijs.setPrijs(nieuwePrijs * ikoers.getKoers());
        }
    }

    protected void loadPrijzenMetTax() {
        for (Prijs prijs : prijzen) {
        }
    }

    private void notificatie() {
        for (PrijsObserver observer : observers) {
            observer.update();
        }
    }

    public void addObserver(PrijsObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PrijsObserver observer) {
        observers.remove(observer);
    }
}

