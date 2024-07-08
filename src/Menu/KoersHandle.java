package Menu;

import Account.AccountSessie;
import Configuration.ConfigureKoers;
import PrijsInvloeden.IKoers;

import java.util.ArrayList;

public class KoersHandle implements IAction{
    ArrayList<IKoers> koersen = new ArrayList<>();
    IKoers iKoers;

    AccountSessie accountSessie;

    KoersHandle(IKoers iKoers, AccountSessie accountSessie){
        this.iKoers = iKoers;
        this.accountSessie = accountSessie;
    }
    @Override
    public void voeruit() {
        ConfigureKoers configureKoers = new ConfigureKoers(iKoers, accountSessie.getPrijsProcesser());
        configureKoers.setiKoers();
    }
}
