import Clase.Giraffe;
import Clase.Zebra;
import Clase.Zoo;

public class Main {

    public static void main(String[] args) {
        Zoo gradinaLuiDumnezeu = new Zoo();
        Giraffe g1 = new Giraffe("MamaLaCopii",250);
        Giraffe g2 = new Giraffe("PoftaInimii",150);
        Zebra z1 = new Zebra("InDungi");
        Zebra z2 = new Zebra("InAlb");
        gradinaLuiDumnezeu.addAnimal(g1);
        gradinaLuiDumnezeu.addAnimal(g2);
        gradinaLuiDumnezeu.addAnimal(z1);
        gradinaLuiDumnezeu.addAnimal(z2);
        gradinaLuiDumnezeu.feedAnimals();


    }

}
