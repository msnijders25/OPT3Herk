package Kleding;

import java.util.ArrayList;
import java.util.Scanner;

public class KledingRepository implements TypesOfClothing{
    ArrayList<IKleding> kleding;

    KledingRepository(ArrayList<IKleding> kleding){
        this.kleding = kleding;
    }
    public KledingRepository(){

    }

    public ArrayList<IKleding> getKleding() {
        return kleding;
    }

    public void setKleding(ArrayList<IKleding> kleding) {
        this.kleding = kleding;
    }

}

interface ICategoryRepository{
    ArrayList<Category> getCategory();
    void  voegCategoryToe(Category category);

}
class maakCategories{

    maakCategories(){}
    public void maakCategories(String naam,  ArrayList<IKleding> iKledings){

    }
    public void setCategoryInRepo(ICategoryRepository iCategoryRepository){
    }

}

class MaakAlleCategories{
    implCategories implCategories;
    maakCategories maakCategories = new maakCategories();
    maakCategories maakCategoriesummer = new maakCategories();

    maakCategories maakCategoriewinter =  new maakCategories();

    maakCategories maakCategoriecasual = new maakCategories();

    maakCategories maakCategorieSport = new maakCategories();
    ICategoryRepository iCategoryRepository;

    MaakAlleCategories(implCategories implCategories){
        this.implCategories = implCategories;
    }

    public void maker(){

        maakCategories.maakCategories("Zomer", new ArrayList<IKleding>());

        maakCategories.setCategoryInRepo(iCategoryRepository);
        maakCategoriesummer.maakCategories("Winter", new ArrayList<IKleding>());
        maakCategoriesummer.setCategoryInRepo(iCategoryRepository);
        maakCategorieSport.maakCategories("Sport", new ArrayList<IKleding>());
        maakCategorieSport.setCategoryInRepo(iCategoryRepository);
        maakCategoriecasual.maakCategories("Casual", new ArrayList<IKleding>());
        maakCategoriecasual.setCategoryInRepo(iCategoryRepository);
        maakCategoriewinter.maakCategories("Casual", new ArrayList<IKleding>());
        maakCategoriewinter.setCategoryInRepo(iCategoryRepository);

    }
}

class implTypeKleding{
    KledingRepository kledingRepository;
    ArrayList<IKleding> kledingen;

   public void testtest(){
       KledingType kledingType;
       Broek broek = new Broek("","s", 1,  KledingType.BROEK);
       kledingen.add(broek);
   }
}