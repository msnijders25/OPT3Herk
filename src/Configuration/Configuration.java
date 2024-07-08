package Configuration;

import Account.*;
import Country.*;
import Language.*;
import PrijsInvloeden.IKoers;
import PrijsInvloeden.ITax;
import PrijsInvloeden.Koers;
import PrijsInvloeden.Tax;

import java.util.ArrayList;
import java.util.Currency;

public class Configuration {
    Account account;
    Koers koers;
    Tax tax;
    Language language;

    public Configuration(Account account, Koers koers, Tax tax, Language language){
       this.account=  account;
       this.koers = koers;
       this.tax = tax;
       this.language = language;
    }

    public void configureMenuOptions(){
        

    }
}

class ConfigurationAll {
    ConfigurationAll(){

    }
}
class ConfigurationKlant {
    ConfigurationKlant(){

    }
}
class ConfigurationTaxfr {
    ICountry iCountry;
    Tax tax;
    ConfigurationTaxfr(ICountry iCountry){
        this.iCountry = iCountry;
    }
    ConfigurationCountryTax configurationCountryTax = new ConfigurationCountryTax();
    public Tax configureIt(){
        configurationCountryTax.configure();
        if (iCountry.getNaamCode() == "NL"){
            this.tax = configurationCountryTax.nl.tax;
            return tax;
        }
        if (iCountry.getNaamCode() == "USA"){
            this.tax = configurationCountryTax.usa.tax;
            return tax;
        }
        else{
            System.out.println("Verkeerde Invoer");
        }
        return null;
    }

}
class ConfigureAccountInstellingen{
    AccountInstellingen accountInstellingen;
    Account account;

    ConfigureAccountInstellingen(ArrayList<AccountInstellingen> accountInstellingen, ArrayList<Account> account){
        for(AccountInstellingen accountInstellingen1: accountInstellingen){
            for(Account account1: account){
                if(accountInstellingen1.getId() == account1.getAccountId()){
                    this.account = account1;
                    this.accountInstellingen = accountInstellingen1;
                }
            }
        }

    }
    ILanguage getLanguage(){
        return accountInstellingen.getiLanguage();
    }
    IKoers getKoers(){
        return accountInstellingen.getiKoers();
    }

    ICountry getCountry(){
        return accountInstellingen.getiCountry();
    }
}

class ConfigurationKoersfr {
    ICountry iCountry;
    Koers koers;
    ConfigurationKoersfr(ICountry iCountry){
        this.iCountry = iCountry;
    }
    ConfigurationCountryKoers configurationCountryKoers = new ConfigurationCountryKoers();
    public Koers configureIt(){
        configurationCountryKoers.configure();
        if (iCountry.getNaamCode() == "NL"){
            this.koers = configurationCountryKoers.nl.currency;
            return koers;
        }
        if (iCountry.getNaamCode() == "USA"){
            this.koers = configurationCountryKoers.usa.currency;
            return koers;
        }
        else{
            System.out.println("Verkeerde Invoer");
        }
        return null;
    }

}
class ConfigurationLanguagefr {
    ICountry iCountry;
    Language language;
    ConfigurationLanguagefr(ICountry iCountry){
        this.iCountry = iCountry;
    }
    ConfigurationCountryLanguage configurationCountryLanguage = new ConfigurationCountryLanguage();
    public Language configureIt(){
        configurationCountryLanguage.configure();
        if (iCountry.getNaamCode() == "NL"){
            this.language = configurationCountryLanguage.nl.language;
            return language;
        }
        if (iCountry.getNaamCode() == "USA"){
            this.language = configurationCountryLanguage.usa.language;
            return language;
        }
        else{
            System.out.println("Verkeerde Invoer");
        }
        return null;
    }

    public Language getLanguage() {
        return language;
    }
}

class ConfigurationTax {
    Tax tax;
    ICountry country;
    ConfigurationTax(ICountry country, Tax tax){
      this.country = country;
      this.tax = tax;
    }

}
class ConfigurationLanguage {
    Language language;
    ICountry country;
    ConfigurationLanguage(ICountry country, Language language){
        this.country = country;
        this.language = language;
    }

}
class ConfigurationCountryLanguage{
    ConfigurationLanguage nl;
    ConfigurationLanguage usa;
    ConfigurationLanguage uk;

    ConfigurationCountryLanguage() {

    }

    public void configure() {
        nl = new ConfigurationLanguage(new Nederland(), new Nederlands());
        usa = new ConfigurationLanguage(new USA(), new English());

    }
}

class ConfigurationKoers {
    Koers currency;
    ICountry country;
    ConfigurationKoers(ICountry country, Koers currency){
        this.country = country;
        this.currency = currency;
    }

}
class ConfigurationCountryKoers {
    ConfigurationKoers nl;
    ConfigurationKoers usa;
    ConfigurationKoers uk;

    ConfigurationCountryKoers() {

    }

    public void configure() {
        nl = new ConfigurationKoers(new Nederland(), new Koers(0.88));
        usa = new ConfigurationKoers(new USA(), new Koers(0.22));

    }
}


class ConfigurationCountryTax {
        ConfigurationTax nl;
        ConfigurationTax usa;
        ConfigurationTax uk;

        ConfigurationCountryTax() {

        }

        public void configure() {
            nl = new ConfigurationTax(new Nederland(), new Tax(0.22));
            usa = new ConfigurationTax(new USA(), new Tax(0.22));

        }
    }
