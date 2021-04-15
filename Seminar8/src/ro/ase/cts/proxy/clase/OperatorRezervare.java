package ro.ase.cts.proxy.clase;

public class OperatorRezervare implements IOperatorRezervare {
    String numeLocal;

    public OperatorRezervare(String numeLocal) {
        this.numeLocal = numeLocal;
    }

    public String getNumeLocal() {
        return numeLocal;
    }

    @Override
    public void rezerva(int numarPersoane) {
        System.out.println("S-a realizat rezervarea pentru " + numarPersoane + " persoane la restaurantul " + numeLocal);
    }
}
