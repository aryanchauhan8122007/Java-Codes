class ElectronicDevice {

    String brand;
    int price;

    ElectronicDevice(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void powerOn() {
        System.out.println(brand + " is turning ON 🔌");
    }

    void powerOff() {
        System.out.println(brand + " is turning OFF ⭕");
    }
}

class Laptop extends ElectronicDevice {

    int ram;

    Laptop(String brand, int price, int ram) {
        super(brand, price);
        this.ram = ram;
    }

    void browseInternet() {
        System.out.println(brand + " Laptop is browsing the internet 💻");
    }
}

class SmartTV extends ElectronicDevice {

    int screenSize;

    SmartTV(String brand, int price, int screenSize) {
        super(brand, price);
        this.screenSize = screenSize;
    }

    void streamMovie() {
        System.out.println(brand + " Smart TV (" + screenSize + " inch) is streaming movies 📺");
    }
}

public class ElectronicsDevice {
    public static void main(String[] args) {

        Laptop l = new Laptop("Dell", 55000, 16);
        l.powerOn();
        l.browseInternet();
        l.powerOff();

        System.out.println("----------");

        SmartTV tv = new SmartTV("Samsung", 45000, 55);
        tv.powerOn();
        tv.streamMovie();
        tv.powerOff();
    }
}
