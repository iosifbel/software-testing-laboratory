package ro.ase.cts.state.clase;

public class Masa {
    private Stare stare;
    private String numar;

    public Masa(String numar) {
        this.stare = new Libera();
        this.numar = numar;
    }

    public void rezerva(){
        Rezervata rezervata = new Rezervata();
        rezervata.schimbaStare(this);
    }

    public void ocupa(){
        Ocupata ocupata = new Ocupata();
        ocupata.schimbaStare(this);
    }

    public void elibereaza(){
        Libera libera= new Libera();
        libera.schimbaStare(this);
    }

    public Stare getStare() {
        return stare;
    }

    void setStare(Stare stare) {
        this.stare = stare;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }
}
