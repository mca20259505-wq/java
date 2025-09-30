import java.util.*;
public class FactorialinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        long[] arr5 = new long[5];

        System.out.println("Enter array elemets :");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
      
        for(int j = 0; j< 5; j++)
        {
            long f = 1;
            for(int k = 1; k<=arr[j]; k++)
            {
                f *= k;
            }
            arr5[j] = f;
        }

        System.out.println("Factorial array :");
        for(int g = 0; g < 5; g++)
        {
            System.out.println(arr[g] +"-->"+arr5[g]);
        }

        sc.close();
    }
}
