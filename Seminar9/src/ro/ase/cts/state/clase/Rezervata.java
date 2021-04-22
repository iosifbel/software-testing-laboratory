package ro.ase.cts.state.clase;

public class Rezervata implements Stare {
    @Override
    public void schimbaStare(Masa masa) {
        if(masa.getStare() instanceof Libera){
            masa.setStare(this);
            System.out.println("Ati rezervat masa cu codul " + masa.getNumar());
        } else {
            System.out.println("Masa este deja rezervata");
        }
    }
}
