package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorCuHandicap;
import ro.ase.cts.template.clase.SpectatorUzual;
import ro.ase.cts.template.clase.TemplateIntrareStadion;

public class Main {
    public static void main(String[] args) {
        TemplateIntrareStadion spectatorUzual = new SpectatorUzual("Gigel");
        TemplateIntrareStadion spectatorCuHandi = new SpectatorCuHandicap("Ionel");
        spectatorUzual.intrareStadion();
        spectatorCuHandi.intrareStadion();
    }
}
