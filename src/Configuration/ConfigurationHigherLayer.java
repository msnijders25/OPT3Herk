package Configuration;

import Account.Account;
import Country.*;

public class ConfigurationHigherLayer {
    ConfigurationKoersfr configurationKoersfr;
    ConfigurationLanguagefr configurationLanguagefr;
    ConfigurationTaxfr configurationTaxfr;
    ConfigurationHigherLayer(ICountry icountry){
        this.configurationKoersfr = new ConfigurationKoersfr(icountry);
        this.configurationLanguagefr = new ConfigurationLanguagefr(icountry);
        this.configurationTaxfr = new ConfigurationTaxfr(icountry);

    }

}
class configureAccountInfo{
    Account account;



}
