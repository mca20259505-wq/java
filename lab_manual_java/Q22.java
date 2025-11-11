import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer no: ");
        int num = sc.nextInt();

        System.out.println("Prime numbers up to " + num + " are:");

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            // Check if i is prime
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;  // not prime, no need to check further
                }
            }

            // Print only if i is prime
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
