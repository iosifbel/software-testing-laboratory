package ro.ase.cts.Decorator.clase;

public class Bilet implements BiletAbstract{
    private String numeGazda;
    private String numeOaspeti;
    private String numeClient;


    @Override
    public void rezervaBilet() {
        System.out.println(numeClient + " are bilet la meciul "+ numeGazda + " - " + numeOaspeti);
    }

    public Bilet(String numeGazda, String numeOaspeti, String numeClient) {
        this.numeGazda = numeGazda;
        this.numeOaspeti = numeOaspeti;
        this.numeClient = numeClient;
    }

    public String getNumeGazda() {
        return numeGazda;
    }

    public String getNumeOaspeti() {
        return numeOaspeti;
    }

    public String getNumeClient() {
        return numeClient;
    }
}
