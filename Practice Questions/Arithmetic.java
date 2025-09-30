import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number :");
        int num1 = sc.nextInt();

        System.out.println("Enter number-2 :");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int product = num1 * num2;
        int div = num1 / num2;

        System.out.println("Addition : " + add);
        System.out.println("Substraction  :" + sub);
        System.out.println("Product : " + product);
        System.out.println("Division :" + div);

        sc.close();
    }
}
