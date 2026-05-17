import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number  : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();

            int result = a / b;   // Will throw error if b = 0
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Catches divide by zero error
            System.out.println("[ERROR] Cannot divide by zero!");

        } catch (Exception e) {
            // Catches any other error
            System.out.println("[ERROR] Invalid input entered!");

        } finally {
            // This ALWAYS runs no matter what
            System.out.println("Program finished safely.");
        }
    }
}