import java.util.*;

public class Q23 {
    public static void displaymid(String str) {
        int len = str.length();
        int mid = len / 2;

        if (len % 2 == 0) {
            System.out.println("Middle characters are: " + str.charAt(mid - 1) + "" + str.charAt(mid));
        } else {
            System.out.println("Middle character is: " + str.charAt(mid));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to get middle character :- ");
        String input = sc.nextLine();

        displaymid(input);

        sc.close();
    }
}
