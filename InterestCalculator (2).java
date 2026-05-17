class InterestCalculator {

    // Simple interest with int
    double calculate(int principal, int rate, int time) {
        return (principal * rate * time) / 100.0;
    }

    // Simple interest with double
    double calculate(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    // Compound interest
    double calculate(double principal, double rate, int time, String type) {
        if(type.equals("compound")) {
            return principal * Math.pow((1 + rate / 100), time) - principal;
        }
        return (principal * rate * time) / 100.0;
    }
}

public class InterestCalculator {
    public static void main(String[] args) {

        InterestCalculator i = new InterestCalculator();

        System.out.println("Simple Interest (int): ₹" + i.calculate(10000, 5, 2));
        System.out.println("Simple Interest (double): ₹" + i.calculate(10000.0, 5.5, 3.0));
        System.out.println("Compound Interest: ₹" + i.calculate(10000.0, 5.0, 2, "compound"));
    }
}
