import java.util.*;
public class Grades {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter marks of history :");
    int history = sc.nextInt();

    System.out.println("Enter marks of Physics :");
    int Physics = sc.nextInt();

    System.out.println("Enter marks of Biology :");
    int biology = sc.nextInt();

    int sum = history + Physics + biology;
    int percentage = sum / 3;

    if(percentage >= 70 )
    {
        System.out.println("Distinction ");
    }else if(percentage >= 60 && percentage <= 69)
    {
        System.out.println("First Class");
    }else if(percentage >= 50 && percentage <= 59)
    {
        System.out.println("Second Class");
    }else if(percentage < 50){
        System.out.println("Pass Class");
    }else{
        System.out.println("Invalid");
    }

    sc.close();
  }    
}
