package ro.ase.cts.strategy.clase;

public class PlataCash implements ModPlata {
    @Override
    public void achita(float suma) {
        System.out.println("S-a realizat plata cash pentru suma " + suma + " lei");
    }
}
