public class StaticVariables {
    static int a = 95;

    StaticVariables() {
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        StaticVariables obj2 = new StaticVariables();
        StaticVariables obj1 = new StaticVariables();
    }
}
