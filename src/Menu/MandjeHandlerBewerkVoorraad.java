package Menu;

import Kleding.IKleding;

import java.util.Scanner;

public class MandjeHandlerBewerkVoorraad implements IAction {
    Mand mand;
    IKleding iKleding;
    Scanner scanner = new Scanner(System.in);

    MandjeHandlerBewerkVoorraad(Mand mand, IKleding iKleding) {
        this.mand = mand;
        voeruit();
    }

    @Override
    public void voeruit() {
        for(IKleding iKleding1: mand.getiKleding()){
            if (iKleding1.getId() == iKleding.getId()){
                System.out.println("Voer nieuwe voorraad in");
                int nieuweVoorraad = scanner.nextInt();
                iKleding.setVoorraad(nieuweVoorraad);
            }
        }
    }
}

