public class qs_20 {
    public static void main(String[] args) {
        System.out.println("argument is : " + args.length);

       String str = args[0];
       String rev = new StringBuilder(str).reverse().toString();

       if(str.equalsIgnoreCase(rev)){
        System.out.println(str + " is palindrome");
       }else{
        System.out.println(str + " is not palindrome");
       }
    }
}
