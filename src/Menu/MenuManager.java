package Menu;

public class MenuManager {
    Menu mainMenu;
    MenuMaker klantMenu;
    MenuMaker kiesAccount;


    MenuMaker adminMenu;
    MenuMaker assortimementMenu;
    MenuMaker mandMenu;


    public MenuManager(){
        MenuFactory menuFactory = new MenuFactory();
        menuFactory.maakMenus();
        this.kiesAccount = menuFactory.getKiesAccountMenu();
        this.klantMenu = menuFactory.getZieKlantMenu();
        this.assortimementMenu = menuFactory.getZieAssortimentMenu();
        this.mandMenu = menuFactory.getZieMandMenu();

    }

    public Menu creatMainMenu(){
        return mainMenu;
    }
    public MenuMaker creatKlantMenu(){
        return klantMenu;
    }
    public MenuMaker creatAdminMenu(){
        return adminMenu;
    }
}
