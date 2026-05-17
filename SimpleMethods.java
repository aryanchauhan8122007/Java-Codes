import java.util.Scanner;
public class SimpleMethods {

    static int multiply(int a, int b) {
        return a * b;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Double   : " + multiply(num, 2));
        System.out.println("Triple   : " + multiply(num, 3));
        System.out.println("Is Even? : " + isEven(num));
    }
}