package ro.ase.cts.Decorator.program;

import ro.ase.cts.Decorator.clase.Bilet;
import ro.ase.cts.Decorator.clase.DecoratorAbstract;
import ro.ase.cts.Decorator.clase.DecoratorCuMesajLMA;
import ro.ase.cts.Decorator.clase.DecoratorCuMesajSustinere;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new Bilet("FCSB","Dinamo","Gigel");
        bilet.rezervaBilet();

        System.out.println();

        DecoratorCuMesajSustinere decoratorCuMesajSustinere = new DecoratorCuMesajSustinere(bilet);
        decoratorCuMesajSustinere.rezervaBilet();

        System.out.println();

        DecoratorCuMesajLMA decoratorCuMesajLMA = new DecoratorCuMesajLMA(bilet);
        decoratorCuMesajLMA.rezervaBilet();

        System.out.println();

        DecoratorAbstract decoratorCombinat = new DecoratorCuMesajLMA(decoratorCuMesajSustinere);
        decoratorCombinat.rezervaBilet();

    }
}
