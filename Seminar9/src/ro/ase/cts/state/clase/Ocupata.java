package ro.ase.cts.state.clase;

public class Ocupata implements Stare {
    @Override
    public void schimbaStare(Masa masa) {
        if(!(masa.getStare() instanceof Libera)){
            masa.setStare(this);
            System.out.println("Ati ocupat masa cu codul " + masa.getNumar());

    }
    }
}
