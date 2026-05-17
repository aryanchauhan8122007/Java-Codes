class Chef {
    void cook() {
        System.out.println("Chef is cooking...");
    }
}

class ItalianChef extends Chef {
    @Override
    void cook() {
        System.out.println("Italian Chef is making Pasta and Pizza 🍝🍕");
    }
}

class ChineseChef extends Chef {
    @Override
    void cook() {
        System.out.println("Chinese Chef is making Noodles and Dumplings 🍜");
    }
}

class IndianChef extends Chef {
    @Override
    void cook() {
        System.out.println("Indian Chef is making Biryani and Curry 🍛");
    }
}

class MexicanChef extends Chef {
    @Override
    void cook() {
        System.out.println("Mexican Chef is making Tacos and Burritos 🌮");
    }
}

public class ChefRecipe {
    public static void main(String[] args) {

        Chef c1 = new ItalianChef();
        Chef c2 = new ChineseChef();
        Chef c3 = new IndianChef();
        Chef c4 = new MexicanChef();

        c1.cook();
        c2.cook();
        c3.cook();
        c4.cook();
    }
}
