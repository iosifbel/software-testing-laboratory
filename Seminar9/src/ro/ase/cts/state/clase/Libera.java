package ro.ase.cts.state.clase;

public class Libera implements Stare {
    @Override
    public void schimbaStare(Masa masa) {
        if (!(masa.getStare() instanceof Libera)) {
            masa.setStare(this);
            System.out.println("Masa cu codul " + masa.getNumar() + " a fost eliberata");

        }
    }
}
