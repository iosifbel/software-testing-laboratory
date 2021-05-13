package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observator> observators;

    public Subiect() {
        this.observators = new ArrayList<>();
    }

    public void adaugaObserver(Observator observator) {
        observators.add(observator);
    }

    public void stergeObeserver(Observator observator) {
        observators.remove(observator);
    }

    public void notificaClienti(String mesaj) {
        for (Observator obs: observators
             ) {
            obs.primesteNotificare(mesaj);
        }
    }
}
