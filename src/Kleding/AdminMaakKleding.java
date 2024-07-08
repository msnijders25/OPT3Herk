package Kleding;

import java.util.Scanner;

public class AdminMaakKleding {

    KledingRepository kledingRepository;
    KledingType kledingType;
    Scanner scanner = new Scanner(System.in);
    ICategoryRepository iCategoryRepository;

    public AdminMaakKleding(ICategoryRepository iCategoryRepository, KledingRepository kledingRepository) {
        this.iCategoryRepository = iCategoryRepository;
        this.kledingRepository = kledingRepository;
    }

    public void createKleding() {
        KledingType gekozenType = null;
        int i = 0;
        for (KledingType type : KledingType.values()) {
            i++;
            System.out.println(i + " " + type + ": " + type.getClass());
        }
        System.out.println("Kies een type:");
        int keuze = scanner.nextInt() - 1;
        if (keuze < 0 || keuze >= KledingType.values().length) {
            System.out.println("Ongeldige keuze. Probeer opnieuw.");
        } else {
            gekozenType = KledingType.values()[keuze];
            System.out.println("U heeft gekozen voor: " + gekozenType);
        }
        System.out.println("Kies een Naam:");
        scanner.nextLine();
        String naam = scanner.nextLine();
        System.out.println("Kies een merk:");
        String merk = scanner.nextLine();
        System.out.println("Kies een prijs:");
        int prijs = scanner.nextInt();
        IKleding iKledingnew = KledingFactory.createKleding(gekozenType, naam, merk,prijs);

            kledingRepository.getKleding().add(iKledingnew);




    for(IKleding iKleding : kledingRepository.getKleding()){
        System.out.println(iKleding.getNaam());
    }
    }
}
