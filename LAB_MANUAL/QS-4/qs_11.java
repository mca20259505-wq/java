import java.util.ArrayList;
import java.util.List;

public class qs_11 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Fruits List: " + fruits);

        System.out.println("Element at index 2: " + fruits.get(2));

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        fruits.set(1, "Pineapple"); 
        System.out.println("After updating index 1: " + fruits);

        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Size of list: " + fruits.size());

        System.out.println("Contains Apple? " + fruits.contains("Apple"));
    }
}
