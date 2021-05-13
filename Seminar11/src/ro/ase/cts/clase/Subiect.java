package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

abstract public class Subiect {
    private List<Observer> observers;

    public Subiect() {
        this.observers = new ArrayList<>();
    }

    public void adaugaObserver(Observer observer) {
        observers.add(observer);
    }

    public void stergeObeserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificaClienti(String mesaj) {
        for (Observer obs: observers
             ) {
            obs.primesteNotificare(mesaj);
        }
    }
}
