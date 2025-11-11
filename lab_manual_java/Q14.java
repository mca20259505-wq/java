import java.util.*;
class Q14
{
    public static void main(String[] args)
    {
        int age;
        String name,address,email,city,state,status,phoneno;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        name=sc.nextLine();
        System.out.println("Enter your Age: ");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Phone number: ");
        phoneno=sc.nextLine();
        System.out.println("Enter your Email: ");
        email=sc.nextLine();
        System.out.println("Enter your Address: ");
        address=sc.nextLine();
        System.out.println("Enter your City: ");
        city=sc.nextLine();   
        System.out.println("Enter your State: ");
        state=sc.nextLine();
        System.out.println("Enter your Status: ");
        status=sc.nextLine();


        System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("Personal Details");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone number : "+phoneno);
        System.out.println("Email : "+email);
        System.out.println("Address : "+address);
        System.out.println("City : "+city);
        System.out.println("State : "+state);
        System.out.println("Status : "+status);
        

    }
}