class DistanceCalculator {

    // Distance in km (int)
    double convert(int km) {
        return km * 1000.0; // to meters
    }

    // Distance in km (double)
    double convert(double km) {
        return km * 1000.0; // to meters
    }

    // Convert based on unit
    double convert(double value, String unit) {
        if(unit.equals("miles")) {
            return value * 1.60934; // miles to km
        } else if(unit.equals("feet")) {
            return value * 0.0003048; // feet to km
        }
        return value;
    }
}

public class DistanceCalculator {
    public static void main(String[] args) {

        DistanceCalculator d = new DistanceCalculator();

        System.out.println("5 km in meters: " + d.convert(5) + " m");
        System.out.println("2.5 km in meters: " + d.convert(2.5) + " m");
        System.out.println("10 miles in km: " + d.convert(10.0, "miles") + " km");
        System.out.println("1000 feet in km: " + d.convert(1000.0, "feet") + " km");
    }
}
