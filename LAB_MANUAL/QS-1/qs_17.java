import java.util.*;
public class qs_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name :");
        String name = sc.nextLine();

        sc.nextLine();

        System.out.println("Enter age :");
        int age = sc.nextInt();

        System.out.println("Enter roll number :");
        int roll = sc.nextInt();

        System.out.println("Enter Marks of History :");
        int history = sc.nextInt();

        System.out.println("Enter marks of polity :");
        int polity  = sc.nextInt();

        System.out.println("Enter marks of physics :");
        int physics = sc.nextInt();

        int total_marks = history + polity + physics;
        double percentage = (total_marks / 300) * 100;
        
        System.out.println("\n\n ====== Marksheet ======");
        System.out.println("Student Name :" + name);
        System.out.println("Roll Number:" + roll);
        System.out.println("Age :" + age);
        System.out.println("History :" + history);
        System.out.println("Physics :" + physics);
        System.out.println("Polity :" + polity);

        System.out.println("== Total : " + total_marks + "/" + "300");
        System.out.println("== Percentage :" + percentage);

        sc.close();
    }
}
