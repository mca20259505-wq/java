import java.util.*;
class Q15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter Principal Amount : ");
          float p = sc.nextFloat();

          System.out.println("Enter  Rate of interest : ");
          float r = sc.nextFloat();

          System.out.println("Enter time(in year) : ");
          float t = sc.nextFloat();
          


          float si=(p*r*t)/100;
          System.out.println("simple interest: "+si);


    }
}