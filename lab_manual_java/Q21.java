public class Q21 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide command-line arguments.");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            String ordinal;

            if (i == 0) ordinal = "First";
            else if (i == 1) ordinal = "Second";
            else if (i == 2) ordinal = "Third";
            else ordinal = (i + 1) + "th"; 

            System.out.println((i + 1) + ".: " + ordinal + " Student Name is = " + args[i]);
        }
    }
}
