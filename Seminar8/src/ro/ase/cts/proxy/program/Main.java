package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervare;
import ro.ase.cts.proxy.clase.Proxy;

public class Main {
    public static void main(String[] args) {
        OperatorRezervare operatorRezervare = new OperatorRezervare("Area51 Pub");
        operatorRezervare.rezerva(3);

        Proxy proxy = new Proxy(operatorRezervare, 4);
        proxy.rezerva(3);
    }
}
