package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.ModPlata;
import ro.ase.cts.strategy.clase.PlataCard;
import ro.ase.cts.strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        ModPlata modPlata = new PlataCard(200);
        Client client = new Client("Andrei", modPlata);
        client.platesteNota(150);
        client.setModPlata(new PlataCash());
        client.platesteNota(50);
        client.setModPlata(modPlata);
        client.platesteNota(100);
    }
}
