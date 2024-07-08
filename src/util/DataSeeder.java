package util;

import Account.Account;
import Bestelling.Bestelling;
import Kleding.*;

import java.util.ArrayList;

public class DataSeeder {
    MockDatabase mockDatabase = new MockDatabase();
    public static DataSeeder instance = null;


    public ArrayList<IKleding> alleKleding = new ArrayList<>();
    private ArrayList<Account> accounts = new ArrayList<>();

    private ArrayList<Bestelling> bestellingen = new ArrayList<>();



    public static DataSeeder getInstance() {
        if (instance == null) {
            instance = new DataSeeder();

        }

        return instance;
    }



    public void seedData() {

  mockDatabase.vulInitieleData();
  mockDatabase.getAllKleding();
  mockDatabase.getAllBestellingen();
  mockDatabase.getAllInstellingen();


  accounts.addAll(mockDatabase.getAllUsers());
  alleKleding.addAll(mockDatabase.getAllKleding());
  bestellingen.addAll(mockDatabase.getAllBestellingen());

    }





    public ArrayList<IKleding>  getAlleKleding() {
        return alleKleding;
    }



    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}