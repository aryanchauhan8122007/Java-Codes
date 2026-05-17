import java.util.Scanner;

class Student {
    String name;
    int age;
    double marks;

    Student(String name, int age, double marks) {
        this.name  = name;
        this.age   = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + (marks >= 60 ? "Pass" : "Fail"));
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");   String n = sc.nextLine();
        System.out.print("Enter age: ");    int a    = sc.nextInt();
        System.out.print("Enter marks: ");  double m = sc.nextDouble();

        Student s = new Student(n, a, m);
        s.display();
    }
}