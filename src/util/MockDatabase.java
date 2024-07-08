package util;

import Account.*;
import Bestelling.Bestelling;
import Country.Nederland;
import Kleding.*;
import Language.*;
import PrijsInvloeden.Koers;

import java.util.ArrayList;
import java.util.List;

public class MockDatabase {
    public ArrayList<Account> usersTable = new ArrayList<>();
    public ArrayList<AccountInstellingen> instellingenTable = new ArrayList<>();
    public ArrayList<IKleding> kledingTable = new ArrayList<>();
    public ArrayList<Bestelling> bestellingTable = new ArrayList<>();
    public ArrayList<KledingType> kledingTypeTable = new ArrayList<>();
    public ArrayList<Category> categoryTable = new ArrayList<>();
    public ArrayList<Profiel> profielTable = new ArrayList<>();

    public void vulInitieleData() {
        Account account1 = new Account("Admin");
        Account account2 = new Account("Normaal");
        Account account3 = new Account("Facebook");
        Account account4 = new Account("Twitter");
        Account account5 = new Account("Instagram");
        Account account6 = new Account("Google");

        addAccount(account1);
        addAccount(account2);
        addAccount(account3);
        addAccount(account4);
        addAccount(account5);
        addAccount(account6);

        AccountInstellingen accountInstellingen = new AccountInstellingen(new Nederland(), new Koers(0.87), new Nederlands(), account1);
        AccountInstellingen accountInstellingen2 = new AccountInstellingen(new Nederland(), new Koers(0.87), new Nederlands(), account2);
        AccountInstellingen accountInstellingen3 = new AccountInstellingen(new Nederland(), new Koers(1.00), new English(), account3);
        AccountInstellingen accountInstellingen4 = new AccountInstellingen(new Nederland(), new Koers(1.00), new English(), account4);
        AccountInstellingen accountInstellingen5 = new AccountInstellingen(new Nederland(), new Koers(1.00), new English(), account5);
        AccountInstellingen accountInstellingen6 = new AccountInstellingen(new Nederland(), new Koers(1.00), new English(), account6);

        addInstelling(accountInstellingen);
        addInstelling(accountInstellingen2);
        addInstelling(accountInstellingen3);
        addInstelling(accountInstellingen4);
        addInstelling(accountInstellingen5);
        addInstelling(accountInstellingen6);

        addKleding(new Broek("Oversized Broek", "ASOS", 99, KledingType.BROEK));
        addKleding(new Broek("Cargo Pants", "H&M", 699, KledingType.BROEK));
        addKleding(new Broek("Comfy Pants", "HEMA", 399, KledingType.BROEK));

        addKleding(new Shirt("Shirt met col", "ASOS", 999, KledingType.SHIRT));
        addKleding(new Shirt("Shirt USA", "Louis", 699, KledingType.SHIRT));
        addKleding(new Shirt("Shirt LA", "Nike", 399, KledingType.SHIRT));

        addKleding(new Hoodie("Hoodie cavs", "Nike", 999, KledingType.HOODIE));
        addKleding(new Hoodie("Oversized Hoodie", "ASOS", 699, KledingType.HOODIE));
        addKleding(new Hoodie("Hoodie Woolly", "ASOS", 399, KledingType.HOODIE));

        addBestelling(new Bestelling(1, 2));
        addBestelling(new Bestelling(1, 2));
        addBestelling(new Bestelling(1, 2));
    }

    public void addAccount(Account user) {
        usersTable.add(user);
    }

    public Account getUser(int id) {
        for (Account account : usersTable) {
            if (account.getAccountId() == id) {
                return account;
            }
        }
        return null;
    }

    public ArrayList<Account> getAllUsers() {
        return new ArrayList<>(usersTable);
    }

    public void updateUser(Account user) {
        for (int i = 0; i < usersTable.size(); i++) {
            if (usersTable.get(i).getAccountId() == user.getAccountId()) {
                usersTable.set(i, user);
                return;
            }
        }
    }

    public void deleteUser(int id) {
        usersTable.removeIf(account -> account.getAccountId() == id);
    }

    public void addInstelling(AccountInstellingen instelling) {
        instellingenTable.add(instelling);
    }

    public AccountInstellingen getInstelling(int id) {
        for (AccountInstellingen instelling : instellingenTable) {
            if (instelling.getId() == id) {
                return instelling;
            }
        }
        return null;
    }

    public ArrayList<AccountInstellingen> getAllInstellingen() {
        return new ArrayList<>(instellingenTable);
    }

    public void updateInstelling(AccountInstellingen instelling) {
        for (int i = 0; i < instellingenTable.size(); i++) {
            if (instellingenTable.get(i).getId() == instelling.getId()) {
                instellingenTable.set(i, instelling);
                return;
            }
        }
    }

    public void deleteInstelling(int id) {
        instellingenTable.removeIf(instelling -> instelling.getId() == id);
    }

    public void addKleding(IKleding kleding) {
        kledingTable.add(kleding);
    }

    public IKleding getKleding(int id) {
        for (IKleding kleding : kledingTable) {
            if (kleding.getId() == id) {
                return kleding;
            }
        }
        return null;
    }

    public ArrayList<IKleding> getAllKleding() {
        return new ArrayList<>(kledingTable);
    }

    public void updateKleding(IKleding kleding) {
        for (int i = 0; i < kledingTable.size(); i++) {
            if (kledingTable.get(i).getId() == kleding.getId()) {
                kledingTable.set(i, kleding);
                return;
            }
        }
    }

    public void deleteKleding(int id) {
        kledingTable.removeIf(kleding -> kleding.getId() == id);
    }

    public void addBestelling(Bestelling bestelling) {
        bestellingTable.add(bestelling);
    }

    public Bestelling getBestelling(int id) {
        for (Bestelling bestelling : bestellingTable) {
            if (bestelling.getId() == id) {
                return bestelling;
            }
        }
        return null;
    }

    public ArrayList<Bestelling> getAllBestellingen() {
        return new ArrayList<>(bestellingTable);
    }

    public void updateBestelling(Bestelling bestelling) {
        for (int i = 0; i < bestellingTable.size(); i++) {
            if (bestellingTable.get(i).getId() == bestelling.getId()) {
                bestellingTable.set(i, bestelling);
                return;
            }
        }
    }

    public void deleteBestelling(int id) {
        bestellingTable.removeIf(bestelling -> bestelling.getId() == id);
    }


    public List<KledingType> getAllKledingTypes() {
        return new ArrayList<>(kledingTypeTable);
    }


}