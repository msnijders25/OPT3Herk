package Country;
import Language.*;
import PrijsInvloeden.*;

import java.util.Currency;

public abstract class Country implements ICountry {
    IKoers koers;
    String naamCode;
    Language language;
    Country(String naamCode, Language language, IKoers koers){
        this.naamCode = naamCode;
        this.language = language;
        this.koers = koers;
    }

    public Country(String nl, Language language) {
    }

    public String getNaamCode() {
        return naamCode;
    }
}

