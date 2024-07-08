package Kleding;

import java.util.ArrayList;



public class CategoryRepository {
    String naam;
    ArrayList<IKleding> iKledings;

    Category category;

   public  CategoryRepository() {

    }

    public CategoryRepository(String naam, ArrayList<IKleding> iKledings, Category category) {
        this.naam = naam;
        this.iKledings = iKledings;
        this.category = category;
    }

    public void setiKledings(ArrayList<IKleding> iKledings) {
        this.iKledings = iKledings;
    }

    public ArrayList<IKleding> getiKledings() {
        return iKledings;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}

