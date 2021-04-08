package ro.ase.cts.adapter.clase;

//de clase
public class Adapter extends Bilet implements BiletOnline{

    public Adapter(float pretBilet) {
        super(pretBilet);
    }

    @Override
    public void vindeBilet() {
        super.vinde();
    }

    @Override
    public void rezervaBilet() {
        super.rezerva();
    }
}
