// package LAB_MANUAL.QS-3;
class Circle{
    double radius;
    Circle(){
         radius = 5.5;
        
    }
    Circle(double r){
         radius = r;
    }
    public double calc(){
        return 3.14 * radius *  radius;
    }
}
public class qs_3 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2 = new Circle(9.9);
        System.out.println("area of circle with default value is :" + c1.calc());
        System.out.println("area of circle with user value :  " + c2.calc());
    }   
}
