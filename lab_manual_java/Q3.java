import java.util.*;
class Q3{
    public static void main(String[] args )
    {
        Scanner input =new Scanner(System.in);
        System.out.println("enter 3 numbr to check largest number");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a +"is largest number");
        }
        else if(b>c)
        {
            System.out.println(b +"is largest number");
        }
        else{
            System.out.println(c +"is largest number");
        }
    }
}