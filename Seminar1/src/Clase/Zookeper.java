package Clase;

public class Zookeper {
    private String name;

    public void feed(Animal animal){
        System.out.println(this.name + " is feeding " + animal.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
