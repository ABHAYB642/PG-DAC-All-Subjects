package threadFuctions;

class MyThread implements Runnable {
    String name;
    Thread t;
    boolean suspended;
    MyThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        suspended = false;
        t.start();
    }
    public void run() {
        try {
            for(int i = 1; i <= 3; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized(this) {
                    while(suspended) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
    synchronized void suspendThread() {
        suspended = true;
    }
    synchronized void resumeThread() {
        suspended = false;
        notify();
    }
}
public class MutexExample {
    public static void main(String args[]) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        
        try {
            Thread.sleep(1000);
            t1.suspendThread();
            System.out.println("Suspending Thread-1");
            Thread.sleep(1000);
            t1.resumeThread();
            System.out.println("Resuming Thread-1");
            t2.suspendThread();
            System.out.println("Suspending Thread-2");
            Thread.sleep(1000);
            t2.resumeThread();
            System.out.println("Resuming Thread-2");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        try {
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Exiting main thread.");
    }
}