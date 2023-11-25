package com.demo.beans;

public class MyStack {
	private int[] arr;
	private int top;
	private int size;
	public MyStack() {
		arr=new int[10];
		size=10;
		top=-1;
	}
	public MyStack(int n) {
		arr=new int[n];
		this.top =-1;
		this.size = n;
	}
	public boolean isempty() {
		if(top==-1) {
			return true;
		}
		return false;
		//return top==-1;
	}
	public boolean isfull() {
		if(top==size-1) {
			return true;
		}
		return false;
		//return top==size-1;
	}
	public int pop() {
		if(!isempty()) {
		int x=arr[top];
		top--;
		return x;
		}
		System.out.println("Stack Underflow");
		return -1;
	}
	public boolean push(int n) {
		if(!isfull()) {
			top++;
			arr[top]=n;
			return true;
		}
		System.out.println("Stack Overflow");
		return false;
	}
	
	
	
}
