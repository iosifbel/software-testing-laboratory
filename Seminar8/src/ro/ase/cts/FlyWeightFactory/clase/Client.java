package ro.ase.cts.FlyWeightFactory.clase;

public class Client implements FlyWeightAbstract {

    private String numeClient;
    private String nrTelefon;
    private String adresaEmail;

    public Client(String numeClient, String nrTelefon, String adresaEmail) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public void afiseazaInformatii(Rezervare rezervare) {
        System.out.println(this.toString() + rezervare.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
