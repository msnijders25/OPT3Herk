package Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInvoerInt implements IMenuInvoer{
    public ArrayList<MenuOptie> opties = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public MenuOptie iMenuOptie = new MenuOptie();
    public  int keuze;
    public MenuInvoerInt(ArrayList<MenuOptie> opties){
        this.opties = opties;
    }

    public MenuInvoerInt() {

    }

    @Override
    public MenuOptie leesInvoer() {
        System.out.println("Voer een cijfer in:");
        this.keuze = scanner.nextInt();
        return iMenuOptie = opties.get(keuze - 1);

    }
}
