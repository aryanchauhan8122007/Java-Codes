class Flower {

    String name;
    String color;

    Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void grow() {
        System.out.println(name + " is growing 🌱");
    }

    void bloom() {
        System.out.println(name + " (" + color + ") is blooming beautifully 🌸");
    }
}

class Rose extends Flower {

    String fragrance;

    Rose(String name, String color, String fragrance) {
        super(name, color);
        this.fragrance = fragrance;
    }

    void spreadFragrance() {
        System.out.println(name + " spreads " + fragrance + " fragrance 🌹");
    }
}

class Sunflower extends Flower {

    int height;

    Sunflower(String name, String color, int height) {
        super(name, color);
        this.height = height;
    }

    void faceTheSun() {
        System.out.println(name + " (" + height + " cm tall) is facing the sun ☀️🌻");
    }
}

public class FlowerBloom {
    public static void main(String[] args) {

        Rose r = new Rose("Red Rose", "Red", "Sweet");
        r.grow();
        r.bloom();
        r.spreadFragrance();

        System.out.println("----------");

        Sunflower s = new Sunflower("Sunflower", "Yellow", 150);
        s.grow();
        s.bloom();
        s.faceTheSun();
    }
}
