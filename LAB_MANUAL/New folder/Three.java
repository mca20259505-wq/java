// package LAB_MANUAL.QS-1;
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c)
        {
            System.out.println(a + " is greatest among 3 numbers");
        }else if (b > c)
        {
            System.out.println(b + " is greatest among 3 numbers");
        }else{
            System.out.println(c + " is greatest among 3 numbers");
        }
        sc.close();
    }
}
