package Account;


import util.DataSeeder;

import java.util.ArrayList;

interface AuthenticatieProvider {
    String getProviderNaam();

    Profiel authenticeer(String inloggegevens);
}
class GoogleAuthenticatieProvider implements AuthenticatieProvider {
    private GoogleApi googleApi;

    public GoogleAuthenticatieProvider(GoogleApi googleApi) {
        this.googleApi = googleApi;
    }

    @Override
    public String getProviderNaam() {
        return "Google";
    }

    @Override
    public Profiel authenticeer(String inloggegevens) {
        if (googleApi.authenticeer(inloggegevens)) {
            return googleApi.haalGebruikersProfielOp(inloggegevens);
        } else {
            return null;
        }
    }
}

class FacebookAuthenticatieProvider implements AuthenticatieProvider {
    private FacebookApi facebookApi;

    public FacebookAuthenticatieProvider(FacebookApi facebookApi) {
        this.facebookApi = facebookApi;
    }

    @Override
    public String getProviderNaam() {
        return "Facebook";
    }

    @Override
    public Profiel authenticeer(String inloggegevens) {
        if (facebookApi.authenticeer(inloggegevens)) {
            return facebookApi.haalGebruikersProfielOp(inloggegevens);
        } else {
            return null;
        }
    }
}

class GoogleApi {

    public boolean authenticeer(String inloggegevens) {
        ArrayList<Account> accounts = new ArrayList<>();
        for(Account account: accounts ) {
            if (account.getLogin() == inloggegevens) {
                return true;
            }
        }
            return false;

        }



    public Profiel haalGebruikersProfielOp(String inloggegevens) {
        for(Account account:DataSeeder.getInstance().getAccounts()){
            if (account.getLogin() == inloggegevens){
                return account.getProfiel();
            }
        }
        return null;
    }
}
class FacebookApi {
    public boolean authenticeer(String inloggegevens) {
        return true;
    }

    public Profiel haalGebruikersProfielOp(String inloggegevens) {
        return new Profiel("Meta Verse", "notMySpace@facebook.com");
    }
}