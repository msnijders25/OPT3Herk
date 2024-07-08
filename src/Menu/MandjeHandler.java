package Menu;

import Account.Account;
import Kleding.IKleding;

import java.util.ArrayList;

public class MandjeHandler implements  IAction{
Mand mand;
IKleding iKleding;

MandjeHandler(Mand mand, IKleding iKleding){
    this.mand = mand;
    this.iKleding = iKleding;
    voeruit();
}
    @Override
    public void voeruit() {
        mand.getiKleding().add(iKleding);
    }
}

class Mand{
    ArrayList<IKleding> iKleding = new ArrayList<>();
    Account account;

    Mand(Account account){
        this.account = account;
    }

    public void setiKleding(ArrayList<IKleding> iKleding) {
        this.iKleding = iKleding;
    }

    public ArrayList<IKleding> getiKleding() {
        return iKleding;
    }
}