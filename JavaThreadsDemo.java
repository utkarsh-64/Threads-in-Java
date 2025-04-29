// Name: Utkarsh Lakhani
// PRN: 23070126064
// Batch: AIML-A3

 public class JavaThreadsDemo {
    // Thread class using extends Thread
    static class MyThread1 extends Thread {
        @Override
        public void run() {
            // Printing numbers from 1 to 5
            System.out.println("MyThread1 is printing numbers 1 to 5:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-1: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread-1 Interrupted");
                }
            }
        }
    }
    // Thread class implementing Runnable
    static class MyThread2 implements Runnable {
        @Override
        public void run() {
            // Printing characters from A to E
            System.out.println("MyThread2 is printing characters A to E:");
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Thread-2: " + c);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread-2 Interrupted");
                }
            }
        }
    }
    // Start thread using class that extends Thread
    public static void startThreadOne() {
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
    // Start thread using class that implements Runnable
    public static void startThreadTwo() {
        Thread t2 = new Thread(new MyThread2());
        t2.start();
    }
    // Start anonymous thread
    public static void startAnonymousThread() {
        Thread t3 = new Thread() {
            public void run() {
                System.out.println("Anonymous thread printing numbers 6 to 10:");
                for (int i = 6; i <= 10; i++) {
                    System.out.println("Anonymous Thread: " + i);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        System.out.println("Anonymous thread interrupted");
                    }
                }
            }
        };
        t3.start();
    }
    // Start lambda thread (Java 8+)
    public static void startRunnableLambda() {
        Thread t4 = new Thread(() -> {
            System.out.println("Lambda thread printing squares of 1 to 5:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda Thread: " + (i * i));
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println("Lambda thread interrupted");
                }
            }
        });
        t4.start();
    }
    public static void main(String[] args) {
        // Main entry point
        System.out.println("=== Java Threads Demonstration ===");
        // Start all thread operations
        startThreadOne();
        startThreadTwo();
        startAnonymousThread();
        startRunnableLambda();
    }
 }
