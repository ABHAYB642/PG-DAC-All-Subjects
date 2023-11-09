package Test;

public class Lambda {

	public static void main(String[] args) {

		Runnable myThread = () -> {

			Thread.currentThread().setName("myThread");
			System.out.println(Thread.currentThread().getName() + " is running");
		};

		Thread run = new Thread(myThread);
		run.start();
		try {
			run.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of program");
		run.stop();
	}
}