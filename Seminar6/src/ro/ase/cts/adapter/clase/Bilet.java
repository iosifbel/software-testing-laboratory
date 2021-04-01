package ro.ase.cts.adapter.clase;

public class Bilet {
    private float pret;

    public Bilet(float pret) {
        this.pret = pret;
    }

    public void rezerva(){
        System.out.print("A fost rezervat biletul cu pretul: "); //mai eficient pentru memorie sa nu concatenam
        System.out.print(pret);
        System.out.println();
    }

    public void vinde() {
        System.out.println("A fost vandut biletul cu pretul: " + pret);
    }
}
