package ro.ase.cts.builder2.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder2.clase.RezervareBuilder2;

public class Main {

    public static void main(String[] args) {
        RezervareBuilder2 builderRezervare = new RezervareBuilder2();
        Rezervare rezervare1 = builderRezervare.setAreBauturaInclusa(true).build();
        Rezervare rezervare2 = new RezervareBuilder2().setAreMuzicaAmbientala(true).setGenMuzica("rock").build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);

    }
}
