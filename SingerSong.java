class Singer {
    void sing() {
        System.out.println("Singer is singing...");
    }
}

class RockSinger extends Singer {
    @Override
    void sing() {
        System.out.println("Rock Singer is singing loud rock music! 🎸");
    }
}

class ClassicalSinger extends Singer {
    @Override
    void sing() {
        System.out.println("Classical Singer is singing ragas! 🎵");
    }
}

class PopSinger extends Singer {
    @Override
    void sing() {
        System.out.println("Pop Singer is singing pop hits! 🎤");
    }
}

class JazzSinger extends Singer {
    @Override
    void sing() {
        System.out.println("Jazz Singer is singing smooth jazz! 🎷");
    }
}

public class SingerSong {
    public static void main(String[] args) {

        Singer s1 = new RockSinger();
        Singer s2 = new ClassicalSinger();
        Singer s3 = new PopSinger();
        Singer s4 = new JazzSinger();

        s1.sing();
        s2.sing();
        s3.sing();
        s4.sing();
    }
}
