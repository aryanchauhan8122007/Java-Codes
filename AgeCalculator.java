class AgeCalculator {

    // Age in years only
    void showAge(int years) {
        System.out.println("Age: " + years + " years");
    }

    // Age in years and months
    void showAge(int years, int months) {
        System.out.println("Age: " + years + " years and " + months + " months");
    }

    // Age in years, months and days
    void showAge(int years, int months, int days) {
        System.out.println("Age: " + years + " years, " + months + " months and " + days + " days");
    }

    // Age as double
    void showAge(double years) {
        System.out.println("Age: " + years + " years (decimal)");
    }
}

public class AgeCalculator {
    public static void main(String[] args) {

        AgeCalculator a = new AgeCalculator();

        a.showAge(20);
        a.showAge(20, 6);
        a.showAge(20, 6, 15);
        a.showAge(20.5);
    }
}
