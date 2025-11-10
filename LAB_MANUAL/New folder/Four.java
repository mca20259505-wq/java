import java.util.*;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many terms you want in Fibonacci series:");
        int n = sc.nextInt();

        int temp = 0;
        int y = 1;

        System.out.print(temp + " " + y + " "); 

        for (int i = 3; i <= n; i++) {   
            int sum = temp + y;
            System.out.print(sum + " ");
            temp = y;
            y = sum;
        }
        sc.close();
    }
}
