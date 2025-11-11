class Point3D {
    double x, y, z;

    // 1st constructor (1 argument)
    Point3D(double a) {
        x = y = z = a;
    }

    // 2nd constructor (2 arguments)
    Point3D(double a, double b) {
        x = a;
        y = b;
        z = 0;
    }

    // 3rd constructor (3 arguments)
    Point3D(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }

    void show() {
        System.out.println(x + " " + y + " " + z);
    }
}
public class Q3_4 {

    public static void main(String[] args) {

        Point3D p1 = new Point3D(5);        // 1 argument
        Point3D p2 = new Point3D(3, 7);     // 2 arguments
        Point3D p3 = new Point3D(1, 2, 3);  // 3 arguments

        p1.show();
        p2.show();
        p3.show();
    }
}
