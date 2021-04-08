package ro.ase.cts.Decorator.clase;

public abstract class DecoratorAbstract implements BiletAbstract{
    protected BiletAbstract biletAbstract;

    public DecoratorAbstract(BiletAbstract biletAbstract) {
        this.biletAbstract = biletAbstract;
    }

    @Override
    public void rezervaBilet() {
        biletAbstract.rezervaBilet();
    }

    public BiletAbstract getBiletAbstract() {
        return biletAbstract;
    }
}
