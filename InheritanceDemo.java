// Parent class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class INHERITS from Animal
class Dog extends Animal {

    Dog(String name) {
        super(name);   // calls Animal constructor
    }

    // Dog has its own method too
    void bark() {
        System.out.println(name + " is barking! Woof!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno");
        dog.eat();     // inherited from Animal
        dog.sleep();   // inherited from Animal
        dog.bark();    // Dog's own method
    }
}