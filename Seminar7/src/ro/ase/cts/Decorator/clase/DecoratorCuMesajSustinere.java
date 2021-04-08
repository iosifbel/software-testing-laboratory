package ro.ase.cts.Decorator.clase;

//decorator concret
public class DecoratorCuMesajSustinere extends DecoratorAbstract{

    public DecoratorCuMesajSustinere(BiletAbstract biletAbstract) {
        super(biletAbstract);
    }

    @Override
    public void rezervaBilet() {
        super.rezervaBilet();
        System.out.println("Mult succes " + ((Bilet) super.getBiletAbstract()).getNumeGazda());
    }


}
