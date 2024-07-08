package Menu;

import java.util.ArrayList;

public class MenuWeergaveMain implements IMenuWeergave{
ArrayList<MenuOptie> opties = new ArrayList<>();
String header;

int mandjeTeller = 0;

    public MenuWeergaveMain(ArrayList<MenuOptie> opties, String header){
        this.opties = opties;
        this.header = header;

    }

    public MenuWeergaveMain() {

    }


    public void toonMenuHeader(){
        System.out.println("======" + header + "======");
    }
    public void toonMandjeTeller(){
        System.out.println("Mandje: " + mandjeTeller);
    }
    public void lijstMenuOptie(){
        for (MenuOptie optie : opties) {
            System.out.println(optie.getIndex() + ". " + optie.getTekst());
        }
    }
    @Override
    public void toonMenu() {
        toonMenuHeader();
        toonMandjeTeller();
        lijstMenuOptie();

    }


    public void updateMandjeTeller(int mandjeTeller) {
        this.mandjeTeller = mandjeTeller;
    }
}
