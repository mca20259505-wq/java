import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Amount :");
      int amount = sc.nextInt();

      System.out.println("Enter duration :");
      int duration = sc.nextInt();

      double rate;

      if(duration <= 5)
      {
        rate = 12;
      }else if(duration <= 10)
      {
        rate = 10;
      }else{
        rate = 5;
      }

      double interest = (amount * rate * duration) / 100;
      double total = amount + interest;

      System.out.println("Simple Interest : " + interest);
      System.out.println("Total amount :" + total);

      sc.close();
    }
}
