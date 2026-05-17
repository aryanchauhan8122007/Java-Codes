class Bird {

    String name;
    String color;

    Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void breathe() {
        System.out.println(name + " is breathing 💨");
    }

    void eat() {
        System.out.println(name + " is eating 🍃");
    }
}

class Eagle extends Bird {

    Eagle(String name, String color) {
        super(name, color);
    }

    void fly() {
        System.out.println(name + " (" + color + ") Eagle is flying high in the sky 🦅");
    }
}

class Penguin extends Bird {

    Penguin(String name, String color) {
        super(name, color);
    }

    void swim() {
        System.out.println(name + " (" + color + ") Penguin is swimming in cold water 🐧");
    }
}

class Parrot extends Bird {

    Parrot(String name, String color) {
        super(name, color);
    }

    void talk() {
        System.out.println(name + " (" + color + ") Parrot is talking! 🦜");
    }
}

public class BirdMovement {
    public static void main(String[] args) {

        Eagle e = new Eagle("Rocky", "Brown");
        e.breathe();
        e.eat();
        e.fly();

        System.out.println("----------");

        Penguin p = new Penguin("Pingu", "Black and White");
        p.breathe();
        p.eat();
        p.swim();

        System.out.println("----------");

        Parrot pr = new Parrot("Mithu", "Green");
        pr.breathe();
        pr.eat();
        pr.talk();
    }
}
