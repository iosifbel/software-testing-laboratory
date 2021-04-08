package ro.ase.cts.Facade.clase;

public class BazaDeDateHuligani {
    public static boolean esteInListaDeHuligani(Persoana persoana){
        return Integer.parseInt("" + persoana.getCNP().charAt(11)) % 2 == 0;
    }
}
