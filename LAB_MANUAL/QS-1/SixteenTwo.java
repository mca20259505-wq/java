public class SixteenTwo {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i ++)
        {
            for(int j = 0; j <= 5 - i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++)
            {
                System.out.print(" * ");
            }
            for(int j = i; j >= i; j--)
            {
                System.out.print(" ");
            }
          
            for(int k = i; k >= 0; k--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
