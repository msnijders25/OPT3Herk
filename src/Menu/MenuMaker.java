package Menu;

import java.util.ArrayList;

public class MenuMaker implements IAction {
    MenuHandle menuHandle = new MenuHandle();
    IMenuWeergave iMenuWeergave;

    public MenuMaker(IMenuWeergave iMenuWeergave, ArrayList<MenuOptie> opties){

        this.iMenuWeergave = iMenuWeergave;
        this.menuHandle = new MenuHandle(iMenuWeergave, new MenuInvoerInt(opties));
    }

    public MenuMaker() {

    }
@Override
    public void voeruit(){
        menuHandle.voeruit();
    }
}
