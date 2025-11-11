class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method overriding

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Q3_5 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();     // Parent class method

        Dog d = new Dog();
        d.sound();     // Overridden method in child class
    }
}
