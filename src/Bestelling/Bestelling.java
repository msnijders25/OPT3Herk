package Bestelling;

import Account.Account;
import Kleding.IKleding;

import java.util.ArrayList;

public class Bestelling {
    ArrayList<IKleding> besteldeKleding;

    Account account;
    int bestellingId;

    public Bestelling(int bestellingId, ArrayList<IKleding> besteldeKleding, Account account){
        this.bestellingId = BestellingIdGenerator.bestellingId;
        this.besteldeKleding = besteldeKleding;
        this.account = account;

    };

    public Bestelling(int bestellingId, int i) {
    }

    public int getId() {
        return bestellingId;
    }

    public Account getAccount() {
        return account;
    }

    public ArrayList<IKleding> getBesteldeKleding() {
        return besteldeKleding;
    }
}

class BestellingIdGenerator {

    static int bestellingId = 1;

    BestellingIdGenerator(int bestellingId){
        this.bestellingId++;

    };
}