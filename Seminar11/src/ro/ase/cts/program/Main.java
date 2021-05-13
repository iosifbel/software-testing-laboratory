package ro.ase.cts.program;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ManagerSala;
import ro.ase.cts.clase.Observer;

public class Main {
    public static void main(String[] args) {
        ManagerSala manager = new ManagerSala();
        Observer client1 = new Client("Popescu");
        Observer client2 = new Client("Popescu2");

        manager.adaugaObserver(client1);
        manager.adaugaObserver(client2);

        manager.setTipMeci("fotbal");
        manager.anuntaMeci();

        manager.stergeObeserver(client2);
        manager.setTipMeci("handbal");
        manager.anuntaMeci();
    }
}
