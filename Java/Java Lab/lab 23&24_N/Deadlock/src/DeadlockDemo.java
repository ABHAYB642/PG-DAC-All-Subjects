public class DeadlockDemo implements Runnable {
	
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void run() {
    	
        synchronized (lock1) {
            System.out.println("Acquired lock1 in " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2) {
                System.out.println("Acquired lock2 in " + Thread.currentThread().getName());
            }
        }

        synchronized (lock2) {
            System.out.println("Acquired lock2 in " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock1) {
                System.out.println("Acquired lock1 in " + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        DeadlockDemo d1 = new DeadlockDemo();
        DeadlockDemo d2 = new DeadlockDemo();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);

        t1.start();
        t2.start();
    }
}