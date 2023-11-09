 package threadLocal;


public class ThreadLocalDemo {

    private static ThreadLocal<String> threadLocalData = new ThreadLocal<>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            threadLocalData.set("Thread 1 data");
            System.out.println("Thread 1 data: " + threadLocalData.get());
        });

        Thread thread2 = new Thread(() -> {
            threadLocalData.set("Thread 2 data");
            System.out.println("Thread 2 data: " + threadLocalData.get());
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread local data after threads execution: " + threadLocalData.get());
    }
}