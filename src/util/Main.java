package util;

import Account.AccountSessie;
import Kleding.*;
import Kleding.ControllerKleding;
import Language.Language;
import Menu.MenuWeergaveMain;
import Menu.*;

import java.awt.*;
import Configuration.*;
import PrijsInvloeden.Koers;
import PrijsProcessor.PrijsProcesserMand;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Koers koers = new Koers(1);
        PrijsProcesserMand processerMand = new PrijsProcesserMand(koers, new Broek("", "", 1, KledingType.BROEK));
Configure configure = new Configure(processerMand,new DataSeeder());
configure.startKiesMenu();

    }
}