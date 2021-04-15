package ro.ase.cts.FlyWeightFactory.Program;

import ro.ase.cts.FlyWeightFactory.clase.Client;
import ro.ase.cts.FlyWeightFactory.clase.FabricaFlyweight;
import ro.ase.cts.FlyWeightFactory.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(3,4,2);
        Rezervare rezervare1 = new Rezervare(2,5,1);
        Rezervare rezervare2 = new Rezervare(5,3,4);

        FabricaFlyweight fabricaFlyweight = new FabricaFlyweight();
        Client client = (Client)fabricaFlyweight.getClient("076000000");
        client.afiseazaInformatii(rezervare);
        Client client1 = (Client)fabricaFlyweight.getClient("076000001");
        client.afiseazaInformatii(rezervare1);
        fabricaFlyweight.getClient("076000000").afiseazaInformatii(rezervare2);
    }
}
