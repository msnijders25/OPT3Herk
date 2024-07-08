package Kleding;

import java.util.ArrayList;

abstract class Kleding implements IKleding {
    int id;
    String naam;
    String merkNaam;
    int prijs;
    KledingType type;
    ArrayList<CategoryRepository> categorieen;

    public Kleding(String naam, String merkNaam, int prijs, KledingType type) {
        this.id = id;
        this.naam = naam;
        this.merkNaam = merkNaam;
        this.prijs = prijs;
    }


    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }


    public int getId() {
        return id;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setMerkNaam(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    public String getMerkNaam() {
        return merkNaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }


    public ArrayList<CategoryRepository> getCategorieen() {
        return categorieen;
    }

    public void setCategorieen(CategoryRepository category) {
        categorieen.add(category);
        category.getiKledings().add(this);
    }

    @Override
    public KledingType getKledingType() {
        return type;
    }
}
