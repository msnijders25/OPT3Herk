package Kleding;

import java.util.ArrayList;

public interface TypesOfClothing {
    public ArrayList<IKleding> getKleding();

    public void setKleding(ArrayList<IKleding> kleding);
    }



interface Winter extends TypesOfClothing{

}
interface Casual extends TypesOfClothing{

}

interface Sport extends TypesOfClothing{

}


class CategorieenKleren{
    ArrayList<String> categorieen = new ArrayList<String>();
    String oversized = "Oversized";
    String casual = "Casual";
    String winter  = "Winter";
    String sport  = "Sport";




    public void setCategorieen(ArrayList<String> categorieen) {
        this.categorieen.add(this.oversized);
        this.categorieen.add(this.casual);
        this.categorieen.add(this.winter);
        this.categorieen.add(this.sport);

    }

    public ArrayList<String> getCategorieen(){
        return categorieen;
    }


}

