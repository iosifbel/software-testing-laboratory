package ro.ase.cts.Facade.program;

import ro.ase.cts.Facade.clase.*;

public class Main {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Andrei", "1990000000011");
        Bilet b1 = new Bilet("Andrei", "1A");

        if(p1.getNume().equals(b1.getNume())){
            if(!Politie.esteUrmarita(p1)){
                if(!BazaDeDateHuligani.esteInListaDeHuligani(p1)){
                    System.out.println("Poftiti!");
                }
            }
        }

        Persoana p2 = new Persoana("Maria", "2990000000001");
        Bilet b2 = new Bilet("Maria", "2C");

        if(Facade.sePermiteAccesulPeStadion(p2,b2))
        {
            System.out.println("Poftiti!");
        }else {
            System.out.println("Ne pare rau, nu aveti voie!");
        }



    }
}
