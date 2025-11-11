import java.util.*;
public class qs_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers/String :");
        String input = sc.nextLine();

        int len = input.length();

        if(len % 2 == 1)
        {
            char mid = input.charAt(len/2);
            System.out.println("middle character :"+mid);
        }else{
            char mid1 = input.charAt(len/2-1);
            char mid2  = input.charAt(len/2);
            System.out.println("middle character(s) are : " + mid1+mid2);
        }

        sc.close();
    }
}


