package Menu;

import Account.*;
import Bestelling.Bestelling;
import BestellingProcessor.BestellingProcesser;
import Kleding.*;
import Language.Language;
import PrijsInvloeden.Koers;
import PrijsProcessor.PrijsProcesserMand;

import java.util.ArrayList;

public class MenuInitialize {
    ArrayList<Bestelling> bestellings;

    ArrayList<MenuOptie> loginOpties = new ArrayList<>();
    ArrayList<MenuOptie> assortimentOpties = new ArrayList<>();

    ArrayList<MenuOptie> mandOpties = new ArrayList<>();
    ArrayList<MenuOptie> bestellingOpties = new ArrayList<>();
    ArrayList<MenuOptie> koersOpties = new ArrayList<>();
    ArrayList<MenuOptie> taalOpties = new ArrayList<>();
    ArrayList<MenuOptie> categoryOpties = new ArrayList<>();
    ArrayList<MenuOptie> klantOpties = new ArrayList<>();

    ArrayList<MenuOptie> kledingTypeOpties = new ArrayList<>();

    MenuFactory menuFactory;




    Account account;
    MenuInitialize(Account account, ArrayList<Bestelling> bestellings){
        this.account = account;
        this.bestellings = bestellings;
    }

    public MenuInitialize() {
this.menuFactory = new MenuFactory();
    }

    public ArrayList<MenuOptie> kiesAccount() {

        MenuOptie optie1 = new MenuOptie(1, "Normaal", false, new LoginController("Normaal", "", menuFactory));
        MenuOptie optie2 = new MenuOptie(2, "Admin", false, new LoginController("Admin", "ss", menuFactory));
        MenuOptie optie3 = new MenuOptie(3, "Google", false, new LoginController("Google", "ss", menuFactory));
        MenuOptie optie4 = new MenuOptie(4, "Facebook", false, new LoginController("Facebook", "ss", menuFactory));
        MenuOptie optie5 = new MenuOptie(5, "Instagram", false, new LoginController("Instagram", "ss", menuFactory));

        loginOpties.add(optie1);
        loginOpties.add(optie2);
        loginOpties.add(optie3);
        loginOpties.add(optie4);
        loginOpties.add(optie5);
        return loginOpties;



    }

    public ArrayList<MenuOptie> createMainKlantMenu() {
        klantOpties = new ArrayList<>();
        MenuOptie optie1 = new MenuOptie(1, "Zie Assortiment", false, menuFactory.getZieAssortimentMenu().menuHandle);
        MenuOptie optie2 = new MenuOptie(2, "Zie Mand", false, menuFactory.getZieMandMenu().menuHandle);
        MenuOptie optie3 = new MenuOptie(3, "Zie Bestellingen", false, menuFactory.getZieBestellingMenu().menuHandle);
        MenuOptie optie4 = new MenuOptie(4, "Verander Koers", false, menuFactory.getVeranderValutaMenu().menuHandle);
        MenuOptie optie5 = new MenuOptie(5, "Verander Taal", false, menuFactory.getVeranderValutaMenu().menuHandle);

        klantOpties.add(optie1);
        klantOpties.add(optie2);
        klantOpties.add(optie3);
        klantOpties.add(optie4);
        klantOpties.add(optie5);
     return klantOpties;
    }
    public ArrayList<MenuOptie> kiesKledingType() {
        int i = 0;
        for(KledingType kledingType: KledingType.values()){
            kledingTypeOpties.add( new MenuOptie(i++, kledingType.name(), false, new MenuFactory().getZieAssortimentMenu().menuHandle));
        }
        return kledingTypeOpties;
    }

    public ArrayList<MenuOptie> zieCategorien(ArrayList<CategoryRepository>categories) {
        int i = 0;
        for(CategoryRepository category: categories){
            categoryOpties.add( new MenuOptie(i++, category.getNaam(), false, new ActionExample()));
        }
        return assortimentOpties;
    }
    public ArrayList<MenuOptie> zieAssortimentMenu(KledingManager kledingManager) {
        int i = 0;
        System.out.println("sss");
        for(IKleding iKleding: kledingManager.getAssortiment()){
            System.out.println("sss");

            assortimentOpties.add(new MenuOptie(i++, iKleding.getNaam()+ "", false, new MenuFactory().getZieAssortimentKeuze().menuHandle));
        }
        return assortimentOpties;
    }

    public ArrayList<MenuOptie> zieAssortimentKeuzeMenu(IKleding ikleding) {
        int i = 0;
        assortimentOpties.add( new MenuOptie(1, "Kies aantal", false, new KledingKiesHandler(ikleding)));
        assortimentOpties.add( new MenuOptie(2, "Kies maat", false, new ActionExample()));
        assortimentOpties.add( new MenuOptie(3, "Zet Kleding in mandje", false, new MandjeHandler( new Mand(new Account("")), ikleding)));

        assortimentOpties.add( new MenuOptie(3, "Ga terug.", false, new ActionExample()));


        return assortimentOpties;
    }
    public void createMandMenu(KledingManager kledingManager, IKleding iKleding) {
        int i = 0;
        Mand mand = new Mand(new Account(""));
       for(IKleding iKledingnew:kledingManager.getMandItems()) {
           System.out.println(i++ + ". " + iKledingnew.getNaam());
       }
        ArrayList<MenuOptie> opties = new ArrayList<>();
        MenuOptie optie1 = new MenuOptie(1, "Plaats bestelling", false, new ActionExample());
        MenuOptie optie2 = new MenuOptie(2, "Bewerk voorraad in Mandje", false, new MandjeHandlerBewerkVoorraad(mand, iKleding));
        MenuOptie optie3 = new MenuOptie(3, "Verwijder in Mandje", false, new MandjeHandlerVerwijder(mand, iKleding));
        MenuOptie optie4 = new MenuOptie(4, "Ga terug?", false, new ActionExample());

        opties.add(optie1);
        opties.add(optie2);
        opties.add(optie3);
        opties.add(optie4);


    }
    public void createMandsubMenuBewerk() {
        ArrayList<MenuOptie> opties = new ArrayList<>();
        MenuOptie optie1 = new MenuOptie(1, "Verhoog aantal", false, new ActionExample());
        MenuOptie optie2 = new MenuOptie(2, "Verlaag aantal", false, new ActionExample());
        MenuOptie optie3 = new MenuOptie(3, "Ga terug?", false, new ActionExample());

        opties.add(optie1);
        opties.add(optie2);
        opties.add(optie3);

    }

    public ArrayList<MenuOptie> createMandMenuBewerk(KledingManager kledingManager) {
        int i = 0;
        for(IKleding iKleding: kledingManager.getMandItems()){
            mandOpties.add(new MenuOptie(i++, iKleding.getNaam(), false, new ActionExample()));
        }
        return mandOpties;
    }
    public ArrayList<MenuOptie> createMandMenuVerwijder(KledingManager kledingManager) {
        int i = 0;
        for(IKleding iKleding: kledingManager.getMandItems()){
            mandOpties.add(new MenuOptie(i++, iKleding.getNaam(), false, new ActionExample()));
        }
        return mandOpties;
    }
    public ArrayList<MenuOptie> createMandMenuPlaatsBestelling(KledingManager kledingManager) {
        int i = 0;
        for(IKleding iKleding: kledingManager.getMandItems()){
            mandOpties.add(new MenuOptie(i++, iKleding.getNaam(), false, new ActionExample()));
        }
        return mandOpties;
    }
    public ArrayList<MenuOptie> createBestellingenMenu(KledingManager kledingManager) {
        int i = 0;
        for(IKleding iKleding: kledingManager.getBestellingenItems()){
        bestellingOpties.add( new MenuOptie(i++, iKleding.getNaam(), false, new ActionExample()));
        }
        return bestellingOpties;
    }

    public ArrayList<MenuOptie> createVeranderKoersMenu(ArrayList<Koers> koersen, AccountSessie accountSessie) {
        int i = 0;
        for(Koers koers: koersen){
         this.koersOpties.add(new MenuOptie(i++, koers.getNaam(), false, new KoersHandle(koers,accountSessie )));
        }
        return koersOpties;
    }
    public ArrayList<MenuOptie> createVeranderTaalMenu(ArrayList<Language> talen) {
        int i = 0;
        for(Language taal: talen){
            this.taalOpties.add(new MenuOptie(i++, taal.getNaam(), false, new ActionExample()));
        }
        return taalOpties;
    }
}

