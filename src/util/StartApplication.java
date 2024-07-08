package util;

import Account.Account;
import Account.AccountSessie;
import Kleding.*;
import Language.*;
import Menu.MenuFactory;
import PrijsInvloeden.Koers;
import PrijsProcessor.PrijsProcesser;

import java.util.ArrayList;

public class StartApplication {

    ApplicationSettings applicationSettings =  new ApplicationSettings();


}

class WERK{
    PrijsProcesser prijsProcesser;

    public void setConfigure( ) {
        DataSeeder dataSeeder= new DataSeeder();

        Configure configure = new Configure(prijsProcesser, dataSeeder);

        configure.menuFactory.maakMenus();

    }
}
class Configure{
    public DataSeeder dataSeeder;

    public KledingManager kledingManager = new KledingManager();

    public KledingRepository kledingRepository = new KledingRepository();
    public ApplicationSettings applicationSettings = new ApplicationSettings();
    public PrijsProcesser prijsProcesser;
    public MenuFactory menuFactory = new MenuFactory();
    KledingManager kledingManager1 = new KledingManager();
    ArrayList<IKleding> iKledingArrayList = new ArrayList<>();
    Configure(PrijsProcesser prijsProcesser, DataSeeder dataSeeder){
        this.prijsProcesser = prijsProcesser;
    }

    public void startKiesMenu(){

        kledingManager1.setAssortiment(iKledingArrayList);
        kledingManager1.addAssortiment(new Broek("22", "222", 111, KledingType.BROEK));
          menuFactory.setKledingManager(kledingManager1);

        menuFactory.getKiesAccountMenu().voeruit();

    }

    public PrijsProcesser getPrijsProcesser() {
        return prijsProcesser;
    }
}
class ConfigureApplication{
    PrijsProcesser prijsProcesser;
    ConfigureApplication(PrijsProcesser prijsProcesser){
        this.prijsProcesser = prijsProcesser;
    }

    public PrijsProcesser getPrijsProcesser() {
        return prijsProcesser;
    }
}
class ApplicationSettings {
    Language language;
    Koers koers;
    AccountSessie accountSessie;

    ApplicationSettings(){
        this.language = new English();
        this.koers = new Koers(0.88);


    }

    public void setAccountSessie(AccountSessie accountSessie) {
        this.accountSessie = accountSessie;
    }

    public void setKoers(Koers koers) {
        this.koers = koers;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public AccountSessie getAccountSessie() {
        return accountSessie;
    }

    public Koers getKoers() {
        return koers;
    }

    public Language getLanguage() {
        return language;
    }
}
