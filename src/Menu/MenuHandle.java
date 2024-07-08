package Menu;

public class MenuHandle implements IAction {
    IMenuWeergave iMenuWeergave = new MenuWeergaveMain();
    MenuInvoerInt iMenuInvoer = new MenuInvoerInt();

   public MenuHandle(IMenuWeergave iMenuWeergave, MenuInvoerInt iMenuInvoer) {
        this.iMenuInvoer = iMenuInvoer;
        this.iMenuWeergave = iMenuWeergave;
    }

    public MenuHandle() {

    }

    @Override
    public void voeruit() {
        iMenuWeergave.toonMenu();
        iMenuInvoer.leesInvoer();
        MenuHandleOptie menuHandleOptie = new MenuHandleOptie(iMenuInvoer.leesInvoer());


    }
}
class MandjeObserverImpl implements MandjeObserver {
    private int mandjeTeller = 0;
    private MenuWeergaveMain menuWeergave;

    public MandjeObserverImpl(MenuWeergaveMain menuWeergave) {
        this.menuWeergave = menuWeergave;
    }

    @Override
    public void update() {
        mandjeTeller += 1;
        menuWeergave.updateMandjeTeller(mandjeTeller);
    }
}