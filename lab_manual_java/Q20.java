public class Q20{
    public static void main(String[] args){
        if(args.length==0)
        {
            System.out.println("please provide control line argument ");
            return;
        }
        String str=args[0];
        str=str.toLowerCase();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);

        }
        if(str.equals(rev))
        {
            System.out.println(str+" is palindrom");
        }
        else
        {
            System.out.println(str+" is not palindrom");
        }
    }
}