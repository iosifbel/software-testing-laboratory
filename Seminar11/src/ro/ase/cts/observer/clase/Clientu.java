package ro.ase.cts.observer.clase;

public class Clientu implements Observator {
    private String nume;

    public Clientu(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul " + nume + " a primit notificarea " + mesaj);
    }
}
