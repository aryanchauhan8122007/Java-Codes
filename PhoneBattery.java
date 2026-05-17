class Phone {

    private String brand;
    private int battery;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBattery(int battery) {
        if(battery >= 0 && battery <= 100) {
            this.battery = battery;
        } else {
            System.out.println("Battery must be between 0 and 100! ❌");
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getBattery() {
        return battery;
    }
}

public class Code4_PhoneBattery {
    public static void main(String[] args) {

        Phone p = new Phone();
        p.setBrand("Samsung");
        p.setBattery(80);
        p.setBattery(150);

        System.out.println(p.getBrand());
        System.out.println(p.getBattery() + "%");
    }
}
