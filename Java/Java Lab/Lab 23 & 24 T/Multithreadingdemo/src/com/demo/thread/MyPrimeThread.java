package com.demo.thread;

import com.demo.beans.MyTasks;

public class MyPrimeThread implements Runnable{

	private MyTasks ob;
	private int n;
	
	public MyPrimeThread(MyTasks ob,int n) {
	  this.ob=ob;
	  this.n=n;
	}
	
	@Override
	public void run() {
		ob.checkPrime(7);
		
	}
}
