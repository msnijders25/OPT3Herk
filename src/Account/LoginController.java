package Account;

import Menu.IAction;
import Menu.MenuFactory;
import Menu.MenuManager;

public class LoginController implements IAction {
    String providerNaam;
    String inloggegevens;

    MenuFactory menuFactory;
    public LoginController(String providerNaam, String inloggegevens, MenuFactory menuFactory){
        this.providerNaam = providerNaam;
        this.inloggegevens = inloggegevens;
        this.menuFactory = menuFactory;
    }
    public void verwerkLogin() {
        AuthenticatieProvider provider = null;


        if (providerNaam.equals("Google")) {
            provider = new GoogleAuthenticatieProvider(new GoogleApi());
        } else if (providerNaam.equals("Facebook")) {
            provider = new FacebookAuthenticatieProvider(new FacebookApi());
        } else if (providerNaam.equals("Normaal")) {
            provider = new Account(inloggegevens);
        } else if (providerNaam.equals("Admin")) {
            provider = new Account(inloggegevens);
        } else {
            throw new IllegalArgumentException("Ongeldige provider: " + providerNaam);
        }

        Profiel gebruiker = provider.authenticeer(inloggegevens);

        for (Account account : util.DataSeeder.getInstance().getAccounts())
            if (inloggegevens.equals(account.getLogin())) {
                Account gebruikerAccount = account;
            }
        if (gebruiker != null) {
            System.out.println("Login succesvol voor gebruiker: " + gebruiker.getNaam());
            if (providerNaam.equals("Admin")){
                menuFactory.getZieAssortimentMenu();
            }
            else {
                menuFactory.getZieAssortimentMenu();

            }
        } else {
            System.out.println("Login mislukt!");
            menuFactory.maakMenus();
            menuFactory.getZieKlantMenu().voeruit();

        }
    }

    @Override
    public void voeruit() {
        verwerkLogin();
    }
}
