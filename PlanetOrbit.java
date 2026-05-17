class Planet {

    String name;
    double distanceFromSun;

    Planet(String name, double distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    void orbit() {
        System.out.println(name + " is orbiting around the Sun 🌞");
    }

    void showInfo() {
        System.out.println(name + " is " + distanceFromSun + " million km from Sun");
    }
}

class RockyPlanet extends Planet {

    String surface;

    RockyPlanet(String name, double distance, String surface) {
        super(name, distance);
        this.surface = surface;
    }

    void showSurface() {
        System.out.println(name + " has a " + surface + " surface 🪨");
    }
}

class GasGiant extends Planet {

    String mainGas;

    GasGiant(String name, double distance, String mainGas) {
        super(name, distance);
        this.mainGas = mainGas;
    }

    void showComposition() {
        System.out.println(name + " is mostly made of " + mainGas + " 💨");
    }
}

public class PlanetOrbit {
    public static void main(String[] args) {

        RockyPlanet earth = new RockyPlanet("Earth", 149.6, "Rocky and Watery");
        earth.orbit();
        earth.showInfo();
        earth.showSurface();

        System.out.println("----------");

        GasGiant jupiter = new GasGiant("Jupiter", 778.5, "Hydrogen and Helium");
        jupiter.orbit();
        jupiter.showInfo();
        jupiter.showComposition();
    }
}
