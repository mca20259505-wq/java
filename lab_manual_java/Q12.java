import java .util.*;
class Q12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Finding area of triangle :");
        System.out.println("enter the height ");
        double h =sc.nextDouble();
        System.out.println("enter the base  ");
        double b =sc.nextDouble();
        double area=0.5*b*h;
        System.out.println("Area of triangle : "+area);
    }
    
}