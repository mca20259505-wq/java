import java.util.LinkedList;
import java.util.Queue;

public class qs_12 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue: " + queue);

        int removedElement = queue.poll(); 
        System.out.println("Removed element: " + removedElement);

        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        queue.offer(50);
        queue.offer(60);

        System.out.println("Final Queue: " + queue);

        System.out.println("Queue contains 30? " + queue.contains(30));

        System.out.println("Size of queue: " + queue.size());
    }
}
