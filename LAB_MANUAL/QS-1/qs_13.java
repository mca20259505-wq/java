import java.util.*;
public class qs_13 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter radius :");
    int n = sc.nextInt();

    double area = Math.PI * (n * n);
    System.out.println(area);
    sc.close();
 }    
}
