class AreaCalculator {

    // Area of Square
    double area(double side) {
        return side * side;
    }

    // Area of Rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    double area(double base, double height, String shape) {
        return 0.5 * base * height;
    }

    // Area of Circle
    double area(int radius) {
        return 3.14 * radius * radius;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {

        AreaCalculator a = new AreaCalculator();

        System.out.println("Square area: " + a.area(5.0));
        System.out.println("Rectangle area: " + a.area(4.0, 6.0));
        System.out.println("Triangle area: " + a.area(3.0, 8.0, "triangle"));
        System.out.println("Circle area: " + a.area(7));
    }
}
