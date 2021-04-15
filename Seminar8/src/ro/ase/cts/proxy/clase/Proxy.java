package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare {
    private OperatorRezervare operatorRezervare;
    private int numarMinimPersoane;

    public Proxy(OperatorRezervare operatorRezervare, int numarMinimPersoane) {
        this.operatorRezervare = operatorRezervare;
        this.numarMinimPersoane = numarMinimPersoane;
    }

    @Override
    public void rezerva(int numarPersoane) {
        if(numarPersoane > numarMinimPersoane){
            operatorRezervare.rezerva(numarPersoane);
        }else{
            System.out.println("Numar prea mic de persoane. Veniti pe aici si discutam. Ok?");
        }

    }
}
