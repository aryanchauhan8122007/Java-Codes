class GreetingMessage {

    void greet(String name) {
        System.out.println("Hello, " + name + "! 👋");
    }

    void greet(String name, String timeOfDay) {
        System.out.println("Good " + timeOfDay + ", " + name + "! 🌟");
    }

    void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old 🎂");
    }

    void greet(String firstName, String lastName, String city) {
        System.out.println("Welcome " + firstName + " " + lastName + " from " + city + "! 🏙️");
    }
}

public class GreetingMessage {
    public static void main(String[] args) {

        GreetingMessage g = new GreetingMessage();

        g.greet("Rahul");
        g.greet("Rahul", "Morning");
        g.greet("Rahul", 20);
        g.greet("Rahul", "Kumar", "Mumbai");
    }
}
