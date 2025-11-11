import java.util.Scanner;
public class qs_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int n = sc.nextInt();

        System.out.println("Prime numbers :");
        for(int i = n; i >= 0; i--)
        {
            if(isPrime(i))
            {
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
    static boolean isPrime(int n)
    {
        if(n <= 1) return false;
        for(int i = 2;i <= Math.sqrt(n);i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
}
