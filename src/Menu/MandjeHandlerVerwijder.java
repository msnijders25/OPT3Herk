package Menu;

import Kleding.IKleding;

import java.util.Scanner;

public class MandjeHandlerVerwijder implements IAction {
    Mand mand;
    IKleding iKleding;
    Scanner scanner = new Scanner(System.in);

    MandjeHandlerVerwijder(Mand mand, IKleding iKleding) {
        this.mand = mand;
        voeruit();
    }

    @Override
    public void voeruit() {
        for (IKleding iKleding1 : mand.getiKleding()) {
            if (iKleding1.getId() == iKleding.getId()) {
                mand.getiKleding().remove(equals(iKleding1));
            }
        }
    }
}
