package Menu;

import Account.AccountSessie;

public class MenuOptieMand implements IMenuOptie, IAction {
    int index;
    String tekst;
    IAction iAction;
    boolean isTerug;
    MenuHandle submenu;

    AccountSessie accountSessie;

    public MenuOptieMand(int index, String tekst, boolean isTerug, IAction iAction) {
        this.isTerug = isTerug;
        this.iAction = iAction;
        this.index = index;
        this.tekst = tekst;
    }

    public MenuOptieMand(int index, String tekst, boolean isTerug, MenuHandle submenu) {
        this.isTerug = isTerug;
        this.submenu = submenu;
        this.index = index;
        this.tekst = tekst;
    }

    public AccountSessie getAccountSessie() {
        return accountSessie;
    }

    public void setAccountSessie(AccountSessie accountSessie) {
        this.accountSessie = accountSessie;
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
        // Implementation of IAction's method
    }
}
