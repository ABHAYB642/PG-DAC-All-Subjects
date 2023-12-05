package com.demo.beans.*;

public class circularQueue {
	private int [] arr;
	private int size;
	private int front;
	private int rear;
	
	public circularQueue() {
		size=10;
		arr= new int[size];
		front=-1;
		rear=-1;
	}
	
	public circularQueue(int a) {
		size= a;
		arr= new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isFull() {
		if(front==0 && rear==size-1) {
			return true;
		}
		if(front==rear+1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(front==-1) {
			return true;
		} else {
			return false;
		}
	}
	                                                            
	public boolean enqueue (int b) {
		if(isFull()) {
			System.out.println("Queue is full!!");
			return false;
		} else {
			if(front==-1) {
				front =0;
			}
				rear=(rear+1)%size;
				arr[rear]=b;
				System.out.println(b+"is added");
			
			return true;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!!");
			return -1;
		} else {
			int a=arr[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			} else {
				front=(front+1)% size;
			}
			System.out.println(a +" is removed");
			return a;
		}
	}
}