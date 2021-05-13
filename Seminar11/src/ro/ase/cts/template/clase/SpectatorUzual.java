package ro.ase.cts.template.clase;

public class SpectatorUzual extends TemplateIntrareStadion{
    private String name;

    public SpectatorUzual(String name) {
        this.name = name;
    }

    @Override
    public void asezareCoada() {
        System.out.println(name + " s-a asezat la coada.");
    }

    @Override
    public void prezentareBilet() {
        System.out.println(name + " prezinta bilet.");
    }

    @Override
    public void controlCorporal() {
        System.out.println("Lui " + name + " i se face controlul corporal.");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(name + " ocupa loc.");
    }
}
