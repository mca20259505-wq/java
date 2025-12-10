import java.util.HashSet;
import java.util.Set;

public class qs_13 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); 
        System.out.println("Fruits Set: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        System.out.println("Size of set: " + fruits.size());

        System.out.println("Iterating through the set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.clear();
        System.out.println("Set after clearing: " + fruits);
    }
}
