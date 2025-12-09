class Point3D{
    double x,y,z;
    Point3D(double x){
        this.x = x;
        this.y = 0;
        this.z = 0;
    }
    Point3D(double x,double y){
        this.x = x;
        this.y = y;
        this.z = 0;
    }
    Point3D(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void display(){
        System.out.println();
        System.out.println("x :"+x);
        System.out.println("y : " + y);
        System.out.println("z : " + z);
        System.out.println();
    }
}
public class qs_4 {
    public static void main(String[] args) {
        
        Point3D p1 = new Point3D(4.6);
        Point3D p2 = new Point3D(3.4,5.5);
        Point3D p3 = new Point3D(2.3,2.3,2.3);
        p1.display();
        p2.display();
        p3.display();
    }
}
