import java.util.*;
public class qs_12 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter height :");
    double height = sc.nextDouble();

    System.err.println("Enter base :");
    double base = sc.nextDouble();

    double area = height * base / 2;
    System.out.println("area of triangle :" + area);
    sc.close();
   }   
}
