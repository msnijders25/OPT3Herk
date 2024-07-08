package BestellingProcessor;

import Account.Account;
import Bestelling.Bestelling;

import java.util.ArrayList;

public class BestellingProcesser {

    public void toonBestelling(Account gekozenAccount, ArrayList<Bestelling> bestellingen){
     for(Bestelling bestelling : bestellingen){
         if (gekozenAccount.getAccountId() == bestelling.getAccount().getAccountId()){
             bestelling.getBesteldeKleding();
         }

     }

    }
    public void plaatsBestelling(){

    }

}
