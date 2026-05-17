class Superhero {

    String heroName;
    String city;

    Superhero(String heroName, String city) {
        this.heroName = heroName;
        this.city = city;
    }

    void saveCity() {
        System.out.println(heroName + " is saving " + city + "! 🦸");
    }

    void fightVillain() {
        System.out.println(heroName + " is fighting the villain! 💪");
    }
}

class FlyingHero extends Superhero {

    int flyingSpeed;

    FlyingHero(String heroName, String city, int flyingSpeed) {
        super(heroName, city);
        this.flyingSpeed = flyingSpeed;
    }

    void fly() {
        System.out.println(heroName + " is flying at " + flyingSpeed + " km/h! 🦅");
    }
}

class StrongHero extends Superhero {

    int liftingPower;

    StrongHero(String heroName, String city, int liftingPower) {
        super(heroName, city);
        this.liftingPower = liftingPower;
    }

    void liftObject() {
        System.out.println(heroName + " can lift " + liftingPower + " tons! 🏋️");
    }
}

public class SuperheroPower {
    public static void main(String[] args) {

        FlyingHero superman = new FlyingHero("Superman", "Metropolis", 1000);
        superman.saveCity();
        superman.fightVillain();
        superman.fly();

        System.out.println("----------");

        StrongHero hulk = new StrongHero("Hulk", "New York", 150);
        hulk.saveCity();
        hulk.fightVillain();
        hulk.liftObject();
    }
}
