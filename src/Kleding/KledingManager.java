package Kleding;

import Account.AccountSessie;
import Bestelling.Bestelling;
import Menu.IAction;
import util.MockDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KledingManager {
    KledingRepository kledingRepository;
    ArrayList<String> countryCode;

    ArrayList<CategoryRepository> categories;

    MockDatabase mockDatabase =  new MockDatabase();


    Map<IKleding, IAction> kledingActieMap = new HashMap<>();

    ArrayList<IKleding> assortiment;

    ArrayList<IKleding> lijstmetCategorie = new ArrayList<>();


    ArrayList<IKleding> mandItems = new ArrayList<>();

    ArrayList<IKleding> bestellingenItems;
    public KledingManager(){
    mockDatabase.vulInitieleData();
        this.assortiment = mockDatabase.getAllKleding();

    }
    public void setAssortimentItems(IKleding iKleding, IAction iAction){
        kledingActieMap.put(iKleding,iAction);
    }

    public void setAssortiment(ArrayList<IKleding> assortiment) {
        this.assortiment = mockDatabase.getAllKleding();
    }
    public void addAssortiment(IKleding iKleding) {
        this.assortiment.add(iKleding);
    }
    public ArrayList<IKleding> getAssortiment() {
        return assortiment;
    }

    public Map<IKleding, IAction> getAssortimentItems() {
        return kledingActieMap;
    }

    public void setMandItems(IKleding iKleding, AccountSessie accountSessie){
        mandItems = accountSessie.getiKleding();
        mandItems.add(iKleding);

        }


    public ArrayList<IKleding> getMandItems() {
        return mandItems;
    }

    public void BestellingenItems(ArrayList<Bestelling> bestellingen){
        for(Bestelling bestelling: bestellingen){

            for(IKleding iKleding: bestelling.getBesteldeKleding()){
               this.bestellingenItems.add(iKleding);
            }
        }
    }

    public ArrayList<IKleding> getBestellingenItems() {
        return bestellingenItems;
    }

    public void MaakMand(){

    }

    public void MaakLijstAssortiment(){

    }
    public void MaakLijstKleding(ArrayList<IKleding> kledingStukken){
        int i = 0;
        for(IKleding iKleding: kledingStukken){
            System.out.println(i++ + ". "+ iKleding.getNaam());
        }
    }
    public void MaakLijstCategorieSpecfie(ArrayList<IKleding> kledingStukken, KledingType kledingType){
       int i = 0;

        for(IKleding iKleding: kledingStukken){
            if(iKleding.getKledingType() == kledingType){
            System.out.println(i++ + ". "+ iKleding.getNaam());
            this.lijstmetCategorie.add(iKleding);
        }
    }}

    }

