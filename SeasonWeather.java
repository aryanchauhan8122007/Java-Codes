class Season {
    void weather() {
        System.out.println("Season has some weather...");
    }
}

class Summer extends Season {
    @Override
    void weather() {
        System.out.println("Summer is hot and sunny! ☀️");
    }
}

class Winter extends Season {
    @Override
    void weather() {
        System.out.println("Winter is cold and chilly! ❄️");
    }
}

class Monsoon extends Season {
    @Override
    void weather() {
        System.out.println("Monsoon is rainy and humid! 🌧️");
    }
}

class Spring extends Season {
    @Override
    void weather() {
        System.out.println("Spring is pleasant and breezy! 🌸");
    }
}

public class SeasonWeather {
    public static void main(String[] args) {

        Season s1 = new Summer();
        Season s2 = new Winter();
        Season s3 = new Monsoon();
        Season s4 = new Spring();

        s1.weather();
        s2.weather();
        s3.weather();
        s4.weather();
    }
}
