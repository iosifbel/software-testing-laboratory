package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Clientu;
import ro.ase.cts.observer.clase.ManagerSali;
import ro.ase.cts.observer.clase.Observator;


public class Main {
    public static void main(String[] args) {
        ManagerSali manager = new ManagerSali();
        Observator client1 = new Clientu("Popescu");
        Observator client2 = new Clientu("Popescu2");

        manager.adaugaObserver(client1);
        manager.adaugaObserver(client2);

        manager.setTipMeci("fotbal");
        manager.anuntaMeci();

        manager.stergeObeserver(client2);
        manager.setTipMeci("handbal");
        manager.anuntaMeci();
    }
}
