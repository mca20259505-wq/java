import java.util.*;
public class qs_25 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.print("enter string-1 :");
        String input1 = sc.nextLine();

        System.out.print("enter string-2 :");
        String input2 = sc.nextLine();
        // length of string 
        System.out.println("length of string : "+input1.length());


        // concatenation of 2 strings
        System.out.println("Concatenation :" + input1 + " " + input2);

        // accessing character using indexing
        System.out.println("Character at index-0 :" + input1.charAt(0));
        System.out.println("Character at index-2 :" + input1.charAt(2));

        // substrings 
        System.out.println("Substring of " + input1 + " :" + input1.substring(2, 4) );

        // string comparision
        System.out.println("comparing " + input1 + " with " + input2 +  " : " + input1.equals(input2));
        System.out.println("comparing " + input1 + " with ignoring case with " + input2 + " : " + input1.equalsIgnoreCase(input2) );

        // replacing chars
        System.out.println("replacing chars in " + input1+" : " + input1.replace(input1.charAt(0), input1.charAt(2)));
        System.out.println("replacing chars in " + input2+" : " + input2.replace(input2.charAt(0), input2.charAt(2)));

        // case conversion 
        System.out.println("lower to upper : " + input1.toUpperCase());
        System.out.println("upper to lower : " + input1.toLowerCase());
        sc.close();
    }
}
