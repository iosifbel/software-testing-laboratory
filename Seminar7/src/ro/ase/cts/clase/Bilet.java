package ro.ase.cts.clase;

public class Bilet {
    private String nume;
    private String loc;

    public Bilet(String nume, String loc) {
        this.nume = nume;
        this.loc = loc;
    }

    public String getNume() {
        return nume;
    }

    public String getLoc() {
        return loc;
    }
}
