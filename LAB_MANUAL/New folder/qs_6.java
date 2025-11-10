import java.util.*;
public class qs_6 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter number :");
     int num = sc.nextInt();

     String len = String.valueOf(num);
     int sum = 0;

     for(int i=0; i < len.length(); i++)
     {
        int digit = Character.getNumericValue(len.charAt(i));
        sum += Math.pow(digit,len.length());
     }
     if(sum == num){
        System.out.println(num + " is armstrong ");
     }else{
        System.out.println(num + " is not armstrong ");
     }
     sc.close();   
    }
}
