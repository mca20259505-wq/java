public class qs_16b {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i ++)
        {
            for(int j = 1; j <= 5; j++)
            {
                // System.out.print(" ");
                if(i == 1 || j == 1 || j == 5 || (i == 2 && (j  <= 2 || j >= 4)))
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
