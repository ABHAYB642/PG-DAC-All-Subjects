package com.demo.test;

import com.demo.beans.MyCircularQueue;

public class CircularQueue {

	public static void main(String[] args) {
		MyCircularQueue ob = new MyCircularQueue(5);
		ob.enqueue(5);
		ob.enqueue(7);
		ob.enqueue(10);
		ob.enqueue(4);
		ob.enqueue(1);
		System.out.println(ob);
		ob.dequeue();
		ob.enqueue(8);
		System.out.println(ob);
		System.out.println(ob.isEmpty());

	}

}
