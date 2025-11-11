// Program to demonstrate 'this', 'super', 'static', and 'final' keywords in Java
import java.util.*;

class Person {
    String name;
    int age;

    // Using 'this' keyword → refers to current object
    Person(String name, int age) {
        this.name = name;  // 'this' differentiates instance variable from parameter
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Parent class
class Animal {
    String type = "Animal";

    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class demonstrating 'super' keyword
class Dog extends Animal {
    String type = "Dog";

    void showType() {
        // Using 'super' to access parent class variable and method
        System.out.println("Child type: " + type);
        System.out.println("Parent type: " + super.type);
        super.sound();  // Calls parent class method
    }
}

// Class demonstrating 'static' keyword
class Counter {
    static int count = 0; // static variable → shared by all objects

    Counter() {
        count++; // increments for every object created
        System.out.println("Object created. Count = " + count);
    }

    static void showCount() { // static method → can be called without object
        System.out.println("Total objects created: " + count);
    }
}

// Class demonstrating 'final' keyword
final class Vehicle { // final class → cannot be inherited
    final int speedLimit = 120; // final variable → value cannot be changed

    final void showSpeed() { // final method → cannot be overridden
        System.out.println("Speed limit is: " + speedLimit);
    }
}

public class Q2_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- THIS keyword ----------------
        System.out.println("\n=== Demonstrating 'this' keyword ===");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        Person p1 = new Person(name, age);
        p1.displayInfo();

        // ---------------- SUPER keyword ----------------
        System.out.println("\n=== Demonstrating 'super' keyword ===");
        Dog d = new Dog();
        d.showType();

        // ---------------- STATIC keyword ----------------
        System.out.println("\n=== Demonstrating 'static' keyword ===");
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter.showCount(); // calling static method without object

        // ---------------- FINAL keyword ----------------
        System.out.println("\n=== Demonstrating 'final' keyword ===");
        Vehicle v = new Vehicle();
        v.showSpeed();

        sc.close();
    }
}
