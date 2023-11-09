package com.demo.thread;

import com.demo.beans.MyTask;

public class MytableThread extends Thread {
	private MyTask ob;
	private int n;

	public MytableThread(MyTask ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}

	public void run() {
		ob.PrintTable(n);
	}

}
