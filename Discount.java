class Discount {
    void getDiscount() {
        System.out.println("Getting discount...");
    }
}

class NewUser extends Discount {
    @Override
    void getDiscount() {
        System.out.println("New User gets 30% discount! 🎉");
    }
}

class OldUser extends Discount {
    @Override
    void getDiscount() {
        System.out.println("Old User gets 10% discount! 😊");
    }
}

class PremiumUser extends Discount {
    @Override
    void getDiscount() {
        System.out.println("Premium User gets 50% discount! 🌟");
    }
}

public class Code9_Discount {
    public static void main(String[] args) {

        Discount d1 = new NewUser();
        Discount d2 = new OldUser();
        Discount d3 = new PremiumUser();

        d1.getDiscount();
        d2.getDiscount();
        d3.getDiscount();
    }
}
