package Menu;

import Kleding.IKleding;

import java.util.Scanner;

public class KledingKiesHandler implements IAction {
    Scanner scanner = new Scanner(System.in);
    IKleding iKleding;
    KledingKiesHandler(IKleding iKleding){
        this.iKleding = iKleding;
    }

    @Override
    public void voeruit() {
        System.out.println("Type voorraad in:");
        int voorraad = scanner.nextInt();
        iKleding.setVoorraad(voorraad);
    }
}
