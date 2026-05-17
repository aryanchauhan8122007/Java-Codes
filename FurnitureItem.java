class Furniture {

    String material;
    String color;
    double price;

    Furniture(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Material: " + material + ", Color: " + color + ", Price: ₹" + price);
    }

    void deliver() {
        System.out.println(material + " furniture is being delivered 🚚");
    }
}

class Sofa extends Furniture {

    int seatingCapacity;

    Sofa(String material, String color, double price, int seatingCapacity) {
        super(material, color, price);
        this.seatingCapacity = seatingCapacity;
    }

    void showSofa() {
        System.out.println("Sofa with " + seatingCapacity + " seating capacity 🛋️");
    }
}

class Bed extends Furniture {

    String bedSize;

    Bed(String material, String color, double price, String bedSize) {
        super(material, color, price);
        this.bedSize = bedSize;
    }

    void showBed() {
        System.out.println(bedSize + " size Bed 🛏️");
    }
}

public class FurnitureItem {
    public static void main(String[] args) {

        Sofa s = new Sofa("Wood", "Brown", 25000, 5);
        s.showDetails();
        s.showSofa();
        s.deliver();

        System.out.println("----------");

        Bed b = new Bed("Teak Wood", "White", 35000, "King");
        b.showDetails();
        b.showBed();
        b.deliver();
    }
}
