class Fruit {
    void taste() {
        System.out.println("Fruit has a taste...");
    }
}

class Mango extends Fruit {
    @Override
    void taste() {
        System.out.println("Mango tastes sweet and juicy! 🥭");
    }
}

class Lemon extends Fruit {
    @Override
    void taste() {
        System.out.println("Lemon tastes sour! 🍋");
    }
}

class Strawberry extends Fruit {
    @Override
    void taste() {
        System.out.println("Strawberry tastes sweet and tangy! 🍓");
    }
}

class Watermelon extends Fruit {
    @Override
    void taste() {
        System.out.println("Watermelon tastes refreshing and sweet! 🍉");
    }
}

public class FruitTaste {
    public static void main(String[] args) {

        Fruit f1 = new Mango();
        Fruit f2 = new Lemon();
        Fruit f3 = new Strawberry();
        Fruit f4 = new Watermelon();

        f1.taste();
        f2.taste();
        f3.taste();
        f4.taste();
    }
}
