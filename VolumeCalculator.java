class VolumeCalculator {

    // Volume of Cube
    double volume(double side) {
        return side * side * side;
    }

    // Volume of Cuboid
    double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    // Volume of Cylinder
    double volume(int radius, double height) {
        return 3.14 * radius * radius * height;
    }
}

public class VolumeCalculator {
    public static void main(String[] args) {

        VolumeCalculator v = new VolumeCalculator();

        System.out.println("Cube volume: " + v.volume(4.0));
        System.out.println("Cuboid volume: " + v.volume(3.0, 4.0, 5.0));
        System.out.println("Cylinder volume: " + v.volume(7, 10.0));
    }
}
