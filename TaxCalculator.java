class TaxCalculator {

    // Tax with int income
    double calculateTax(int income) {
        return income * 0.10;
    }

    // Tax with double income
    double calculateTax(double income) {
        return income * 0.10;
    }

    // Tax with income and custom rate
    double calculateTax(double income, double rate) {
        return income * rate / 100;
    }

    // Tax with income, rate and deduction
    double calculateTax(double income, double rate, double deduction) {
        double taxableIncome = income - deduction;
        return taxableIncome * rate / 100;
    }
}

public class TaxCalculator {
    public static void main(String[] args) {

        TaxCalculator t = new TaxCalculator();

        System.out.println("Tax (int): ₹" + t.calculateTax(50000));
        System.out.println("Tax (double): ₹" + t.calculateTax(50000.0));
        System.out.println("Tax (custom rate): ₹" + t.calculateTax(50000.0, 20.0));
        System.out.println("Tax (with deduction): ₹" + t.calculateTax(50000.0, 20.0, 10000.0));
    }
}
