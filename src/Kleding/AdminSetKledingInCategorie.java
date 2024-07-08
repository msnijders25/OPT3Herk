package Kleding;

import java.util.Scanner;



public class AdminSetKledingInCategorie {
    implCategories iCategoryRepository;
    IKleding iKleding;
    public AdminSetKledingInCategorie(implCategories iCategoryRepository, IKleding iKleding) {
        this.iCategoryRepository = iCategoryRepository;
        this.iKleding = iKleding;

    }

    Scanner scanner = new Scanner(System.in);

    public void playAround() {
        System.out.println("Kies een categorie om toe te voegen aan kledingItem");
        String keuzeCategorie = scanner.nextLine();
        for (Category category : iCategoryRepository.getCategory()) {

        }
    }
}
