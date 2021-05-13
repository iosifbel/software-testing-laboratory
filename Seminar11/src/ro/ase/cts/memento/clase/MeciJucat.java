package ro.ase.cts.memento.clase;

public class MeciJucat {
    private int nrSpectatori;
    private String echipaGazda;
    private String echipaOaspete;
    private int nrBileteVandute;
    private int nrSticleApaVandute;
    private int nrJandarmi;

    public MeciJucat(int nrSpectatori, String echipaGazda, String echipaOaspete, int nrBileteVandute, int nrSticleApaVandute, int nrJandarmi) {
        this.nrSpectatori = nrSpectatori;
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSticleApaVandute = nrSticleApaVandute;
        this.nrJandarmi = nrJandarmi;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public void setNrSticleApaVandute(int nrSticleApaVandute) {
        this.nrSticleApaVandute = nrSticleApaVandute;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public Memento salvareInformatii() {
        Memento memento = new Memento(nrSpectatori,echipaGazda,echipaOaspete);
        return memento;
    }

    public void revenire(Memento memento){
        this.nrSpectatori = memento.getNrSpectatori();
        this.echipaGazda =  memento.getEchipaGazda();
        this.echipaOaspete = memento.getEchipaOaspete();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MeciJucat{");
        sb.append("nrSpectatori=").append(nrSpectatori);
        sb.append(", echipaGazda='").append(echipaGazda).append('\'');
        sb.append(", echipaOaspete='").append(echipaOaspete).append('\'');
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append(", nrSticleApaVandute=").append(nrSticleApaVandute);
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append('}');
        return sb.toString();
    }
}
