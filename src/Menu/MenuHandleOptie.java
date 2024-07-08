package Menu;

public class MenuHandleOptie {
    MenuOptie iMenuOptie;
    IMenuWeergave iMenuWeergave;
    MenuHandleOptie(MenuOptie iMenuOptie){

        this.iMenuOptie = iMenuOptie;

        if(iMenuOptie.getSubMenu() == null && iMenuOptie.getIsTerug() == false){
            handleOptieActie();}
        else {
            handleOptieSubMenu();}
    }

    public void handleOptieSubMenu(){

    }

    public void handleOptieActie(){
        iMenuOptie.getAction().voeruit();
    }
}


