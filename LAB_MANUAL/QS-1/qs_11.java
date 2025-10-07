public class qs_11 {
    public static void main(String[] args) {

        int x = 5;
        int y = 5;

        System.out.println("Arithmetic Operators :");
        System.out.println("addition :" + (x + y));
        System.out.println("Substraction :" + (x - y));
        System.out.println("multiplication :" + (x * y));
        System.out.println("division :" + (x / y));

        System.out.println("\n  Comparison Operators :");
        System.out.println("double equals to :" + (x == y));
        System.out.println("not equals to :" + (x != y));
        System.out.println("less then :" + (x > y));
        System.out.println("greater then :" + (x < y));
        System.out.println("less then :" + (x >= y));
        System.out.println("greater then :" + (x <= y));

        System.out.println("\n Logical Operators :");
        if (x >= y && y == x) {
            System.out.println("if condition true");
        }
        if (x >= y || y == x) {
            System.out.println("or operator");
        }
        if ((x >= y)) {
            System.out.println("not operato :" + !(x >= y));
        }

    }
}
