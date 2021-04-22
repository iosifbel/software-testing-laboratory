package ro.ase.cts.strategy.clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public Client(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public void platesteNota(float suma){
        System.out.println(nume + " are de platit nota in valoare de " + suma + " lei");
        modPlata.achita(suma);
    }
}
