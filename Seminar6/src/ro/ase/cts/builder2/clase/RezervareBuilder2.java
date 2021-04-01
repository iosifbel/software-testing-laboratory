package ro.ase.cts.builder2.clase;

import ro.ase.cts.builder.clase.Rezervare;

public class RezervareBuilder2 implements BuilderAbstract{
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areBauturaInclusa;
    private boolean areScaunErgonomic;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public RezervareBuilder2() {
        super();
        codRezervare = 0;
        areMancareInclusa = false;
        areBauturaInclusa = false;
        areScaunErgonomic = false;
        areMuzicaAmbientala = false;
        genMuzica = "pop";
    }
    public RezervareBuilder2(int codRezervare, boolean areMancareInclusa, boolean areBauturaInclusa, boolean areScaunErgonomic, boolean areMuzicaAmbientala, String genMuzica) {
        super();
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areBauturaInclusa = areBauturaInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public RezervareBuilder2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public RezervareBuilder2 setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public RezervareBuilder2 setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.areBauturaInclusa = areBauturaInclusa;
        return this;
    }

    public RezervareBuilder2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public RezervareBuilder2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public RezervareBuilder2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare,areMancareInclusa,areBauturaInclusa,areScaunErgonomic,areMuzicaAmbientala,genMuzica);
    }
}
