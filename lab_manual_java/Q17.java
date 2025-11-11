import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        String roll = sc.nextLine();

        // Marks input
        System.out.print("Enter marks for Math: ");
        int math = sc.nextInt();

        System.out.print("Enter marks for Science: ");
        int science = sc.nextInt();

        System.out.print("Enter marks for English: ");
        int english = sc.nextInt();

        // Total and percentage calculation
        int total = math + science + english;
        float percentage = total / 3.0f;

        // Printing marksheet
        System.out.println("\n===== MARKSHEET =====");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + roll);
        System.out.println("Math       : " + math);
        System.out.println("Science    : " + science);
        System.out.println("English    : " + english);
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage +" %");
        System.out.println("=====================");
        
        sc.close();
    }
}
