class Athlete {
    void perform() {
        System.out.println("Athlete is performing...");
    }
}

class Swimmer extends Athlete {
    @Override
    void perform() {
        System.out.println("Swimmer is swimming in the pool 🏊");
    }
}

class Runner extends Athlete {
    @Override
    void perform() {
        System.out.println("Runner is sprinting on the track 🏃");
    }
}

class Gymnast extends Athlete {
    @Override
    void perform() {
        System.out.println("Gymnast is doing flips and tricks 🤸");
    }
}

class Boxer extends Athlete {
    @Override
    void perform() {
        System.out.println("Boxer is punching and dodging 🥊");
    }
}

public class AthleteSport {
    public static void main(String[] args) {

        Athlete a1 = new Swimmer();
        Athlete a2 = new Runner();
        Athlete a3 = new Gymnast();
        Athlete a4 = new Boxer();

        a1.perform();
        a2.perform();
        a3.perform();
        a4.perform();
    }
}
