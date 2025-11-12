import java.util.*;
public class qs_5 {
    static int fact(int n)
    {
        if(n == 0 || n ==1)
        {
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number :");
        int num = sc.nextInt();

        int r = fact(num);
        System.out.println("factorial of " + num + " is " + r);
    }
}
