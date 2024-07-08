package Account;


public class Account implements AuthenticatieProvider{
    String inloggegevens;
    String email;

    int accountId;
    Profiel profiel;

    public Account(String inloggegevens) {
        this.inloggegevens = inloggegevens;
    }
    public Account(String inloggegevens, String email, Profiel profiel) {
        this.inloggegevens = inloggegevens;
        this.email = email;
        this.profiel = profiel;
    }

    public Profiel getProfiel() {
        return profiel;
    }

    public void setProfiel(Profiel profiel) {
        this.profiel = profiel;
    }

    @Override
    public String getProviderNaam() {
        return null;
    }

    @Override
    public Profiel authenticeer(String inloggegevens) {
        return null;
    }

    public String getLogin() {
        return inloggegevens;
    }

    public int getAccountId() {
        return accountId;
    }
}
