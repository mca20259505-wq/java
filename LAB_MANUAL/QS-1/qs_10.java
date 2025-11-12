import java.util.*;
public class qs_10 {
    static void findGreaterNum(int n1,int n2, int n3)
    {
         int largest = (n1 > n2 && n1 > n3) ? n1 : 
                      (n2 > n3) ? n2 : n3;
        System.out.println("max number is : " + largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number-1 :");
        int num1 = sc.nextInt();

        System.out.println("enter number-2 : ");
        int num2 = sc.nextInt();

        System.out.println("enter number-3 :");
        int num3 = sc.nextInt();

        
        findGreaterNum(num1,num2,num3);
        sc.close();
    }
}
