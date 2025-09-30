import java.util.Scanner;
public class UserInput
{
    public static void main(String[] args)
    {
      Scanner sc  = new Scanner(System.in);
      
      System.out.println("Enter your name please!!");
      String name = sc.nextLine();

      System.out.println("Enter your age :");
      int age = sc.nextInt();

      System.out.println("Your name is   " + name +  "  and age is :" + age);

      sc.close();
    }
}