package Country;

import Language.Nederlands;

public class Nederland extends Country {
    Nederlands language = new Nederlands();

    public Nederland() {

        super("Nederland", new Nederlands());

    }
}
