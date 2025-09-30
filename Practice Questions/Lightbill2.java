import java.util.Scanner;
public class Lightbill2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Electricity Units consumption :");
        float Units = sc.nextFloat();

        float Total_bill = 0;
        float Copy_Units = Units;

        if (Units >= 300)
        {
            Total_bill += (Units - 300) * 12;
            Units = 300;
        }
        if(Units >= 200)
        {
            Total_bill += (Units - 200) * 11;
            Units = 200;
        }
        if(Units >= 100)
        {
            Total_bill += (Units - 100) *10;
            Units = 100;
        }
        if(Units >= 0)
        {
            Total_bill += (Units * 8);

        }
        System.out.println("Total Unit Consumption :" + Copy_Units);
        System.out.println("Total Cost :" + Total_bill);

        sc.close();
    }
}
