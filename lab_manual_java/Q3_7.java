abstract class Shape {
    abstract void numberOfSides();
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Trapezoid extends Shape {
    void numberOfSides() {
        System.out.println("Trapezoid has 4 sides");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class Q3_7 {
    public static void main(String[] args) {
        Shape t = new Triangle();
        Shape tr = new Trapezoid();
        Shape h = new Hexagon();

        t.numberOfSides();
        tr.numberOfSides();
        h.numberOfSides();
    }
}
