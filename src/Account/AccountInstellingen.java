package Account;

import Country.ICountry;
import Language.ILanguage;
import PrijsInvloeden.*;

public class AccountInstellingen {

     int id = 0;
    ICountry iCountry;
    IKoers iKoers;
    ILanguage iLanguage;

    public AccountInstellingen(ICountry iCountry, IKoers iKoers, ILanguage iLanguage, Account account){
        this.id = account.getAccountId();
        this.iCountry = iCountry;
        this.iKoers = iKoers;
        this.iLanguage = iLanguage;
    }




    public void setiCountry(ICountry iCountry) {
        this.iCountry = iCountry;
    }

    public void setiKoers(IKoers iKoers) {
        this.iKoers = iKoers;
    }

    public void setiLanguage(ILanguage iLanguage) {
        this.iLanguage = iLanguage;
    }

    public ICountry getiCountry() {
        return iCountry;
    }

    public IKoers getiKoers() {
        return iKoers;
    }

    public ILanguage getiLanguage() {
        return iLanguage;
    }

    public  int getId() {
        return id;
    }
}
