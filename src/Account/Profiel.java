package Account;

public class Profiel {
    String naam;
    String email;
    public Profiel(String naam, String email) {
        this.naam = naam;
        this.email = email;
    }

    public String getNaam() {
        return naam;
    }

    public String getEmail() {
        return email;
    }
}
