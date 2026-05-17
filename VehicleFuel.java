class Vehicle {
    void fuelType() {
        System.out.println("Vehicle uses some fuel...");
    }
}

class PetrolCar extends Vehicle {
    @Override
    void fuelType() {
        System.out.println("Petrol Car uses Petrol ⛽");
    }
}

class DieselTruck extends Vehicle {
    @Override
    void fuelType() {
        System.out.println("Diesel Truck uses Diesel 🚛");
    }
}

class ElectricCar extends Vehicle {
    @Override
    void fuelType() {
        System.out.println("Electric Car uses Electricity ⚡");
    }
}

class HybridCar extends Vehicle {
    @Override
    void fuelType() {
        System.out.println("Hybrid Car uses both Petrol and Electricity 🔋⛽");
    }
}

public class VehicleFuel {
    public static void main(String[] args) {

        Vehicle v1 = new PetrolCar();
        Vehicle v2 = new DieselTruck();
        Vehicle v3 = new ElectricCar();
        Vehicle v4 = new HybridCar();

        v1.fuelType();
        v2.fuelType();
        v3.fuelType();
        v4.fuelType();
    }
}
