import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount : ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of interest : ");
        double r = sc.nextDouble();
        System.out.print("Enter Time (in years)  : ");
        double t = sc.nextDouble();

        // Simple Interest formula: (P * R * T) / 100
        double si = (p * r * t) / 100;

        // Compound Interest formula: P * (1 + R/100)^T
        double ci = p * Math.pow(1 + r / 100, t) - p;

        System.out.printf("Simple Interest   : %.2f%n", si);
        System.out.printf("Compound Interest : %.2f%n", ci);
    }
}
