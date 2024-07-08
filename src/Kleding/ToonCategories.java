package Kleding;

import javax.swing.*;
import java.util.Scanner;



public class ToonCategories {
    implCategories implCategories;
    MaakAlleCategories maakAlleCategories;

    public ToonCategories(implCategories implCategories) {
        this.implCategories = implCategories;
        this.maakAlleCategories = new MaakAlleCategories(implCategories);
        maakAlleCategories.maker();
    }


    public void toonCategories(Category gekozenCategorie) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (Category category : implCategories.getCategory()) {
            i++;
        }
        System.out.println("kies categorie");
        int keuze = scanner.nextInt();
        scanner.nextLine();
         gekozenCategorie = implCategories.getCategory().get(keuze - 1);
         int b = 0;

        int keuzeb = scanner.nextInt();

    }
}
class menuCategorien{
    ToonCategories toonCategories;
    IKleding iKleding;
    Category gekozenCategory;
    public void newtest(){
        toonCategories.toonCategories(gekozenCategory);

}}
