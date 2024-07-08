package Menu;

public class MenuOptieManager {
    MenuOptieBestelling menuOptieBestelling;
    MenuOptieMand menuOptieMand;
    MenuOptie menuOptie;

    IMenuOptie iMenuOptie;

    MenuOptieManager(MenuOptieBestelling menuOptieBestelling, MenuOptieMand menuOptieMand, MenuOptie menuOptie) {
        this.menuOptieBestelling = menuOptieBestelling;
        this.menuOptieMand = menuOptieMand;
        this.menuOptie = menuOptie;
    }
    public void manage(IAction iAction){
        if(iMenuOptie instanceof MenuOptieBestelling)
        if(menuOptieBestelling.getAction() == iAction){
            menuOptieBestelling.getAccountSessie();
        }
        if(iMenuOptie instanceof MenuOptieMand)
            if(menuOptieMand.getAction() == iAction) {
                menuOptieMand.getAccountSessie();
            }
    }

    public void setiMenuOptie(IMenuOptie iMenuOptie) {
        this.iMenuOptie = iMenuOptie;
    }
}
