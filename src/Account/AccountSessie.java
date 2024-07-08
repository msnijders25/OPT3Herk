package Account;

import Kleding.IKleding;
import Kleding.Prijs;
import PrijsProcessor.PrijsProcesser;

import java.util.ArrayList;

public class AccountSessie {
    private Sessie session;
    private Account account;

    private ArrayList<IKleding> iKleding;
    PrijsProcesser prijsProcesser;

    public AccountSessie(Account account, PrijsProcesser prijsProcesser) {
        this.account = account;
        this.session = new Sessie();
        this.prijsProcesser = prijsProcesser;
    }

    public AccountSessie(Account account) {
        this.account = account;
        this.session = new Sessie();
        this.prijsProcesser = prijsProcesser;
    }

    public void setiKleding(ArrayList<IKleding> iKleding) {
        this.iKleding = iKleding;
    }

    public ArrayList<IKleding> getiKleding() {
        return iKleding;
    }

    public int getSessionId() {
        return session.getSessionId();
    }

    public Account getAccount() {
        return account;
    }

    public PrijsProcesser getPrijsProcesser() {
        return prijsProcesser;
    }
}
 class Sessie {
    private int sessionId;

    public Sessie() {
        this.sessionId = SessieIdGenerator.generateSessieId();
    }

    public int getSessionId() {
        return sessionId;
    }
}
class SessieIdGenerator {
    private static int nextSessionId = 1;

    public static int generateSessieId() {
        return nextSessionId++;
    }
}