package com.demo.beans;

import java.util.Arrays;

public class MyCircularQueue {
	private int[] qarr;
	private int front;
	private int back;
	private int size;
	
	public MyCircularQueue() {
		qarr = new int[10];
		front =-1;
		back=-1;
		size=10;
	}
	public MyCircularQueue(int n) {
		qarr = new int[n];
		front =-1;
		back=-1;
		size=n;
	}
	@Override
	public String toString() {
		return "MyCircularQueue [qarr=" + Arrays.toString(qarr) + ", front=" + front + ", back=" + back + "]";
	}
	public boolean isEmpty() {
		return front==-1;
	}
	public boolean isFull() {
		if (front==0 && back == qarr.length-1) {
			return true;
		}else if(front == back+1) {
			return true;
		}else {
			return false;
		}
	}
	public void enqueue(int a) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			if(front==-1) {front =0;}
			back = (back+1)%size;
			qarr[back] = a;
		}
	}
	public int dequeue() {
		int num;
		if(isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}else {
			num=qarr[front];
			if(front==back) {
				front=back=-1;
			}else {
			front = (front+1)%size;
			}
			return num;
		}
	}
}
