import Kleding.IKleding;
import Menu.MenuFactory;
import Menu.MenuInitialize;
import Menu.MenuMaker;
import org.junit.jupiter.api.Test;
import util.MockDatabase;

public class Testtest {
    @Test
    public void newtest(){

        MockDatabase mockDatabase = new MockDatabase();
        for(IKleding iKleding: mockDatabase.getAllKleding()){
            System.out.println(iKleding.getNaam());
        }
    }}
