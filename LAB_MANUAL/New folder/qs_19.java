import java.util.*;
class RandomNums{
    static void generate(){
        Random rand = new Random();
        int[] numbers = new int[10];
        System.out.println("Random Numbers :");

        for(int i=0; i < 10; i++){
            numbers[i] = rand.nextInt(10);
            System.out.println(numbers[i]);
        }
    }
}
public class qs_19 {
    public static void main(String[] args) {
     RandomNums.generate();
    }
}
