//    Q3_3 ) Write a Java program which creates the Circle class and takes the two constructors 
//of the Circle class. First constructor takes the default value for radius and second 
//constructor takes radius as parameter. Create a method calcArea() and calculate the 
//area of the Circle and print the area of the circle. 


class Circle {
    double radius;

    // 1. Default constructor
    Circle() {
        radius = 1.0;  // default radius
    }

    // 2. Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    // Method to calculate and print area
    void calcArea() {
        double area = 3.14159 * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        // Object with default radius
        Circle c1 = new Circle();
        c1.calcArea();

        // Object with custom radius
        Circle c2 = new Circle(5.0);
        
        c2.calcArea();
    }
}
