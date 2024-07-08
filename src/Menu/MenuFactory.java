package Menu;


import Account.AccountSessie;
import Kleding.*;
import PrijsProcessor.PrijsProcesser;

public class MenuFactory {
    MenuMaker kiesAccountMenu = new MenuMaker();
    MenuMaker zieKlantMenu  = new MenuMaker();;
    MenuMaker zieAssortimentMenu = new MenuMaker();

    MenuMaker zieKledingCategorienMenu = new MenuMaker();

    MenuMaker zieMandMenu = new MenuMaker();
    MenuMaker zieBestellingMenu = new MenuMaker();
    MenuMaker veranderValutaMenu = new MenuMaker();

    MenuMaker zieAssortimentKeuze = new MenuMaker();

    KledingManager kledingManager = new KledingManager();
    MenuInitialize menuInitialize = new MenuInitialize();

    PrijsProcesser prijsProcesser;
    AccountSessie accountSessie;
    public MenuFactory(AccountSessie accountSessie, PrijsProcesser prijsProcesser){
        this.accountSessie = accountSessie;
        this.prijsProcesser = prijsProcesser;
        maakMenus();
    }

    public MenuFactory(){
        maakMenus();

    }

    public void maakMenus() {
        this.kiesAccountMenu = new MenuMaker(new MenuWeergaveMain(menuInitialize.kiesAccount(), "VoorPagina"), menuInitialize.kiesAccount());
        this.zieKlantMenu = new MenuMaker(new MenuWeergaveMain(menuInitialize.createMainKlantMenu(), "VoorPagina"), menuInitialize.kiesAccount());
        this.zieAssortimentMenu = new MenuMaker(new MenuWeergaveMain(menuInitialize.zieAssortimentMenu(kledingManager), "VoorPagina"), menuInitialize.kiesAccount());
        this.zieKledingCategorienMenu = new MenuMaker(new MenuWeergaveMain(menuInitialize.kiesKledingType(), "VoorPagina"), menuInitialize.kiesAccount());
        this.zieAssortimentKeuze = new MenuMaker(new MenuWeergaveMain(menuInitialize.zieAssortimentKeuzeMenu(new Broek("","",1, KledingType.BROEK)), "VoorPagina"), menuInitialize.kiesAccount());

        this.zieMandMenu = new MenuMaker(new MenuWeergaveMain(menuInitialize.mandOpties, "VoorPagina"), menuInitialize.kiesAccount());
        this.zieBestellingMenu = new MenuMaker(new MenuWeergaveMain(menuInitialize.bestellingOpties, "VoorPagina"), menuInitialize.kiesAccount());
        this.veranderValutaMenu = new MenuMaker(new MenuWeergaveMain(menuInitialize.koersOpties, "VoorPagina"), menuInitialize.kiesAccount());
    }


    public MenuMaker getZieAssortimentKeuze() {
        return zieAssortimentKeuze;
    }

    public MenuMaker getZieKledingCategorienMenu() {
        return zieKledingCategorienMenu;
    }

    public MenuMaker getKiesAccountMenu()
    {
        return kiesAccountMenu;
    }

    public MenuMaker getZieKlantMenu() {
        return zieKlantMenu;
    }

    public MenuMaker getZieAssortimentMenu() {
        return zieAssortimentMenu;
    }

    public MenuMaker getZieMandMenu() {
        return zieMandMenu;
    }

    public MenuMaker getZieBestellingMenu() {
        return zieBestellingMenu;
    }

    public MenuMaker getVeranderValutaMenu() {
        return veranderValutaMenu;
    }

    public void setKledingManager(KledingManager kledingManager) {
        this.kledingManager = kledingManager;
    }

    public KledingManager getKledingManager() {
        return kledingManager;
    }
}


