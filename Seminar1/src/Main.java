import Clase.Giraffe;
import Clase.Zoo;

public class Main {

    public static void main(String[] args) {
        Zoo gradinaLuiDumnezeu = new Zoo();
        Giraffe g1 = new Giraffe("MamaLaCopii",250);
        Giraffe g2 = new Giraffe("PoftaInimii",150);
        gradinaLuiDumnezeu.addAnimal(g1);
        gradinaLuiDumnezeu.addAnimal(g2);
        gradinaLuiDumnezeu.feedAnimals();


    }

}
