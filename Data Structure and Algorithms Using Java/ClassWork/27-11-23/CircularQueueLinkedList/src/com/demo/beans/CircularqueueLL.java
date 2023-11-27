package com.demo.beans;



public class CircularqueueLL {
	private Node rear;
	private Node front;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
		
	}
	public CircularqueueLL() {
		super();
		rear=null;
		front=null;
	}
	public boolean isEmpty() {
		if(front == null && rear== null) {
			return true;
		}
		return false;
	}
	public void enqueue(int data) {
		Node n = new Node(data);
		if(isEmpty()) {
			front=n;
			rear=n;
		}else {
//			System.out.println("rear    " + rear);
			front.next=n;
			front=n;
		}
		front.next=rear;
		
	}
@Override
	public String toString() {
		return "CircularqueueLL [rear=" + rear.data + ", front=" + front.data + "]";
	}
	
	public int dequeue() {
		
		if(isEmpty()) {
			System.out.println("Cannot remove ");
			return -1;
		}else {
			Node temp=rear;
			rear=rear.next;
			front.next=rear;
			temp.next=null;
			
			return temp.data;
		}
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("no element to show");
			
		}
		else {
			Node temp=rear;
			while(temp!=front) {
				System.out.print(temp.data +"->");
				temp=temp.next;
				
			}
			System.out.print(front.data);
		}
	}
	
	
	
	
}
