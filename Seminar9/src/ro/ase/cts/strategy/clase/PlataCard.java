package ro.ase.cts.strategy.clase;

public class PlataCard implements ModPlata{
    private float sold;

    public PlataCard(float sold) {
        this.sold = sold;
    }

    @Override
    public void achita(float suma) {
        if(suma <= sold)
        {
            System.out.println("S-a realizat plata cu cardul pentru suma " + suma + " lei");
            sold -= suma;
        }else {
            System.out.println("Fonduri insuficiente");
        }
    }
}
