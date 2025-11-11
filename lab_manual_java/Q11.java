import java.util.*;
class Q11{

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the number ");
        int a=sc.nextInt();
        System.out.println("enter the number ");
        int b=sc.nextInt();


        /// arithmatic operation
        System.out.println("\n Arithmatic operators");
        System.out.println("Addtion : "+(a+b));
        System.out.println("Subtraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Divison : "+(a/b));
        System.out.println("Module : "+(a%b));
        
        //asignment operator
        System.out.println("\n Assignment operators");
        System.out.println("Addtion : "+(a+=b));
        System.out.println("Subtraction : "+(a-=b));
        System.out.println("Multiplication : "+(a*=b));
        System.out.println("Divison : "+(a/=b));
        System.out.println("Module : "+(a%=b));


        //comparison operator
        System.out.println("\n comparison operators");
        System.out.println("equal to :"+(a==b));
        System.out.println("not equal to : "+(a!=b));
        System.out.println("greater then : "+(a>b));
        System.out.println("less than : "+(a<b));
        System.out.println("greater than or equal to  : "+(a>=b));
        System.out.println("less than or equal to  : "+(a<=b));
    }
}