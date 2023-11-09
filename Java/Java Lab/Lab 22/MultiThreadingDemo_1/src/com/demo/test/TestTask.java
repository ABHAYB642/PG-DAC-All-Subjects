package com.demo.test;

import com.demo.beans.MyTask;
import com.demo.thread.MytableThread;

public class TestTask {
	public static void main(String[] args) {
		MyTask ob = new MyTask();
		// ob.PrintTable(4);
		// ob.PrintTable(5);

		System.out.println(ob.factorial(5));

		// Multithreaded
		MytableThread th = new MytableThread(ob, 7);
		th.start();
		th.setPriority(10);
		MytableThread th2 = new MytableThread(ob, 9);
		th.yield();
		th2.start();

		try {
			th.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.yield();
		System.out.println("Th2 Get Priority: " + th2.getPriority());
		System.out.println("End of main");
	}
}
