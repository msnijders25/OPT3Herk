package Kleding;
import Voorraad.*;
import VoorraadProcessor.IVoorraad;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface IKleding {
    IVoorraad getVoorraad();

    String getNaam();

    int getBasisPrijs();

    void setVoorraad(int i);


    void setBasisPrijs(double nieuwePrijs);

    int getId();
    ArrayList<CategoryRepository> getCategorieen();
   void setCategorieen(CategoryRepository categorie);

   KledingType getKledingType();

}
