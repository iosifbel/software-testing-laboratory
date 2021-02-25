package Clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Zookeper zookeper;
    private List<Animal> animals;

    public Zoo() {
        this.zookeper = new Zookeper();
        this.zookeper.setName("prostuClasei");
        this.animals = new ArrayList<>();
    }

    public Zoo(Zookeper zookeper, List<Animal> animals) {
        super();
        this.zookeper = zookeper;
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void feedAnimals(){
        for (Animal animal:animals
             ) {
            zookeper.feed(animal);
        }
    }
}
