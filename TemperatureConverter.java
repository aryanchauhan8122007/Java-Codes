class TemperatureConverter {

    // int celsius to fahrenheit
    double convert(int celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    // double celsius to fahrenheit
    double convert(double celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    // celsius to fahrenheit or kelvin based on unit
    double convert(double celsius, String unit) {
        if(unit.equals("kelvin")) {
            return celsius + 273.15;
        }
        return (celsius * 9.0 / 5) + 32;
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {

        TemperatureConverter t = new TemperatureConverter();

        System.out.println("100°C to F: " + t.convert(100) + "°F");
        System.out.println("36.6°C to F: " + t.convert(36.6) + "°F");
        System.out.println("0°C to Kelvin: " + t.convert(0.0, "kelvin") + "K");
    }
}
