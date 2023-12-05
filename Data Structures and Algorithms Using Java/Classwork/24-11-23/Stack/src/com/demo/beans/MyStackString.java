package com.demo.beans;

public class MyStackString {
	private String [] str;
	private int top;
	private int size;
	public MyStackString() {
		str=new String[10];
		size=10;
		top=-1;
	}
	public MyStackString(int n) {
		str=new String[n];
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
	public String pop() {
		if(!isempty()) {
		String x=str[top];
		top--;
		return x;
		}
		System.out.println("Stack Underflow");
		return null;
	}
	public boolean push(String n) {
		if(!isfull()) {
			top++;
			str[top]=n;
			return true;
		}
		System.out.println("Stack Overflow");
		return false;
	}
	
	
	
}
