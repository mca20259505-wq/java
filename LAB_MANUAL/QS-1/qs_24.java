import java.util.*;
public class qs_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows for 2 matrices :");
        int rows = sc.nextInt();

        System.out.println("enter number of columns for 2 matrices :");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];


        System.out.println("enter values in matrix-1");
        for(int i = 0; i<rows;i++){
            for(int j =0;j<cols;j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter values in matrix-2");
        for(int i = 0; i<rows;i++){
            for(int j =0;j<cols;j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n ===== Matrix-1 =====");
        for(int i = 0; i< rows; i++)
        {
            for(int j = 0; j<cols;j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n ===== Matrix-2 =====");
        for(int i = 0; i< rows; i++)
        {
            for(int j = 0; j<cols;j++)
            {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("addition of 2 matrices :");
        
        for(int i =0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
              
                System.out.print(matrix1[i][j] + matrix2[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("multiplication of 2 matrices :");
        for(int i = 0; i < rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(matrix1[i][j] * matrix2[i][j] + "  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
