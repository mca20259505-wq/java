import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number to sum");
        int n = sc.nextInt();

        int sum = 0; 

    
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum += num; 
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
