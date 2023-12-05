package com.demo.test;

import com.demo.beans.CircularqueueLL;


public class CircularQueue {

	public static void main(String[] args) {
		CircularqueueLL ob = new CircularqueueLL();
		ob.enqueue(5);
		ob.enqueue(7);
		ob.enqueue(10);
		ob.enqueue(4);
		ob.enqueue(1);
		System.out.println(ob);
		System.out.println(ob.dequeue());
		System.out.println(ob);
		ob.enqueue(20);
		//System.out.println(ob.isEmpty());

	}

}
