public class qs_16c {
    public static void main(String[] args) {
        int n = 7; 

        for (int i = 1; i <= 7; i += 2) {
            for (int j = i; j < 7; j += 2) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        for (int i = 5; i >= 1; i -= 2) {
            for (int j = i; j < 7; j += 2) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
