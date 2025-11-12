import java.util.*;
public class qs_9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter num-1 :");
        int num1 = sc.nextInt();

        System.out.print("enter num-2 :");
        int num2 = sc.nextInt();

        System.out.println("numbers before swapping : " + num1 +" " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2; 

        System.out.println("numbers after swapping : " + num1 +" " + num2);
        sc.close();

    }
}
