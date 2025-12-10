class IncrementThread extends Thread {
    private int value;

    IncrementThread(int startValue) {
        value = startValue;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) { 
            value++; 
            System.out.println("Current value: " + value);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println("Final value: " + value);
    }
}

public class qs_9 {
    public static void main(String[] args) {
        IncrementThread t = new IncrementThread(0); 
        t.start();
    }
}
