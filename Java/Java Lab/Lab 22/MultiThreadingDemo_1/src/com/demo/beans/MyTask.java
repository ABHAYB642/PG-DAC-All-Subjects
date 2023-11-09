package com.demo.beans;

public class MyTask {

	public void PrintTable(int i) {
		// TODO Auto-generated method stub
		for (int j = 1; j <= 10; j++) {
			System.out.println(i + " * " + j + " = " + i * j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public int factorial(int i) {
		// TODO Auto-generated method stub
		int fact = 1;
		for (int j = 1; j <= i; j++) {
			fact = fact * j;
		}
		return fact;
	}

}
