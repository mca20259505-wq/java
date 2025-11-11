class Q16_2
{
    public static void main(String[] args)
    {
        int n = 3; // number of rows

        for(int i = 1; i <= n; i++) // outer loop for rows
        {
            for(int j = 1; j <= 2*n-1; j++) // inner loop for columns
            {
                if(i == 1 || j == i || j == 2*n-i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                System.out.print(" "); // spacing for alignment
            }
            System.out.println(); // move to next row
        }
    }
}
