import java.util.*;
public class qs_14 {
    static void showdata(String name,String phone,String city,int adhdhar,int pan,int voter)
    {
        System.out.println("\n =====Personal Data======");
        System.out.println("Name : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("City : " + city );
        System.out.println("adhdhar number : " + adhdhar);
        System.out.println("Pan Number : " + pan);
        System.out.println("Voter number : " + voter );

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your name :");
        String name = sc.nextLine();

        System.out.print("enter your phone :");
        String phone = sc.nextLine();

        System.out.print("enter your city :");
        String city = sc.nextLine();

        System.out.print("enter your adhdhar number :");
        int adhdhar = sc.nextInt();

        System.out.print("enter pan number :");
        int pan = sc.nextInt();

        System.out.print("enter your voter number :");
        int voter = sc.nextInt();

        showdata(name,phone,city,adhdhar,pan,voter);

        sc.close();
    }
}
