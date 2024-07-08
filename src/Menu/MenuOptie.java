package Menu;

import Account.AccountSessie;
import Kleding.IKleding;

public class MenuOptie implements IMenuOptie, IAction {
    int index;
    String tekst;
    IAction iAction;
    boolean isTerug;
    MenuHandle submenu;

    public MenuOptie(int index, String tekst, boolean isTerug, IAction iAction) {
        this.isTerug = isTerug;
        this.iAction = iAction;
        this.index = index;
        this.tekst = tekst;
    }



    public MenuOptie() {

    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getTekst() {
        return tekst;
    }

    IAction getAction() {
        return iAction;
    }

    @Override
    public boolean getIsTerug() {
        return isTerug;
    }

    @Override
    public MenuHandle getSubMenu() {
        return submenu;
    }

    @Override
    public void voeruit() {
        iAction.voeruit();
    }
}

