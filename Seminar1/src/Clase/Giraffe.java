package Clase;

public class Giraffe extends Animal {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Giraffe(String name) {
        super(name);
    }

    public Giraffe(String name, int height) {
        super(name);
        this.height = height;
    }
}
