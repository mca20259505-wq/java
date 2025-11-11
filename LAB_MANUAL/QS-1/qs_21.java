import java.util.Scanner;

public class qs_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of arguments : " + args.length);

        for (int i = 0; i < args.length; i++) {
            String pos = "";

            switch (i) {
                case 0:
                    pos = "First ";
                        break;
                case 1 :
                    pos = "second";
                       break;
                case 2 :
                    pos = "third";
                       break;
                case 3 :
                    pos = "fourth";
                       break;
                default:
                    pos = (i+1) + "th";
                    break;
            }
            System.out.println((i+1)+" : "+pos+"student name is :"+args[i]);
        }
        sc.close();
    }
}
