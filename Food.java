class Food {
    void cook() {
        System.out.println("Cooking food...");
    }
}

class Pizza extends Food {
    @Override
    void cook() {
        System.out.println("Baking Pizza in oven 🍕");
    }
}

class Burger extends Food {
    @Override
    void cook() {
        System.out.println("Grilling Burger on pan 🍔");
    }
}

class Pasta extends Food {
    @Override
    void cook() {
        System.out.println("Boiling Pasta in water 🍝");
    }
}

public class Code7_Food {
    public static void main(String[] args) {

        Food f1 = new Pizza();
        Food f2 = new Burger();
        Food f3 = new Pasta();

        f1.cook();
        f2.cook();
        f3.cook();
    }
}
