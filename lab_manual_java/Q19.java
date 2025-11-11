import java.util.Random;
public class Q19{
public static void main(String  agrs[]) 
{

        Random rand=new Random();
        int store[]=new int[10];

        for(int i=0;i<10;i++)
        {
           store[i]= rand.nextInt(100);
        }

        for(int i=0;i<10;i++)
        {
            System.out.println((i+1)+" "+store[i]);
        }


}
}
