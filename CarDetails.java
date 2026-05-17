class CarDetails {

    private String carName;
    private int speed;
    private double fuelLevel;

    public void setCarName(String name) {
        this.carName = name;
    }

    public void setSpeed(int speed) {
        if(speed >= 0 && speed <= 300) {
            this.speed = speed;
        } else {
            System.out.println("Speed must be between 0 and 300! ❌");
        }
    }

    public void setFuelLevel(double fuel) {
        if(fuel >= 0 && fuel <= 100) {
            this.fuelLevel = fuel;
        } else {
            System.out.println("Fuel level must be between 0 and 100! ❌");
        }
    }

    public String getCarName() { return carName; }
    public int getSpeed() { return speed; }
    public double getFuelLevel() { return fuelLevel; }
}

public class CarDetails {
    public static void main(String[] args) {

        CarDetails c = new CarDetails();
        c.setCarName("BMW");
        c.setSpeed(120);
        c.setFuelLevel(75.5);
        c.setSpeed(500);     // invalid
        c.setFuelLevel(200); // invalid

        System.out.println("Car: " + c.getCarName());
        System.out.println("Speed: " + c.getSpeed() + " km/h");
        System.out.println("Fuel: " + c.getFuelLevel() + "%");
    }
}
