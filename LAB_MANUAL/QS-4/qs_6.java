class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running: " + i + " (Priority: " + getPriority() + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
        System.out.println(getName() + " finished execution.");
    }
}

public class qs_6 {
    public static void main(String[] args) {
       
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY); 
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY); 

        System.out.println("Thread-1 priority: " + t1.getPriority());
        System.out.println("Thread-2 priority: " + t2.getPriority());
        System.out.println("Thread-3 priority: " + t3.getPriority());
        System.out.println("-----------------------------");

      
        t1.start();
        t2.start();
        t3.start();
    }
}
