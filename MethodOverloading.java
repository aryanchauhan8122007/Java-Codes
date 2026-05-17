public class MethodOverloading {

    // Same method name — different parameters
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Two integers  : " + add(5, 10));
        System.out.println("Three integers: " + add(5, 10, 15));
        System.out.println("Two doubles   : " + add(3.5, 2.5));
    }
}
