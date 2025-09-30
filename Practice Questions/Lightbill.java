import java.util.Scanner;

public class Lightbill {
    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter unit consumption :");
        float Units = sc.nextFloat();

        float amount = 0;
        float Total_bill = 0;
        if(Units <= 100)
        {
            amount = 8;
            Total_bill = amount * Units;
        }else if(Units > 100 && Units <= 200)
        {
            amount = 10;
            Total_bill = amount * Units;
        }else if(Units > 200 && Units <= 300)
        {
            amount = 11;
            Total_bill = amount * Units;
        }else if(Units > 300)
        {
            amount = 12;
            Total_bill = amount * Units;
        }else{
            System.out.println("Try again !!");
        }
        System.out.println("Total Units consumption :" + Units);
        System.out.println("Total Cost :" + Total_bill);

        sc.close();
    }
}
