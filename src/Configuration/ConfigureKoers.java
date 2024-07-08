package Configuration;

import Kleding.Prijs;
import PrijsInvloeden.IKoers;
import PrijsProcessor.PrijsProcesser;

public class ConfigureKoers {
    IKoers iKoers;
    PrijsProcesser prijsProcesser;
    public ConfigureKoers(IKoers ikoers, PrijsProcesser prijsProcesser){
        this.iKoers = ikoers;
    }

    public void setiKoers() {
        prijsProcesser.setIkoers(iKoers);
    }
}
