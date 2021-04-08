package ro.ase.cts.Decorator.clase;

public class DecoratorCuMesajLMA extends DecoratorAbstract{
    public DecoratorCuMesajLMA(BiletAbstract biletAbstract) {
        super(biletAbstract);
    }

    @Override
    public void rezervaBilet() {
        super.rezervaBilet();
        System.out.println("La multi ani!");
    }
}
