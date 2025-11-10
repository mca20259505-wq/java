import java.util.*;
public class FactorialRecursion {
  
    static int  fact(int n){
        if(n == 0){
            return 1;
        }
        return n *= fact(n-1);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num = sc.nextInt();
        int r = fact(num);
        System.out.println(r);
        sc.close();
    }
}
