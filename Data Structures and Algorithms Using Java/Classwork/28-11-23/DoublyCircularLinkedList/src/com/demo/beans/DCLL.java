package com.demo.beans;
//Double Circular Linked List
public class DCLL {
	Node head;
	public class Node{
		int data;
		Node prev;
		Node next;
		public Node(int value) {
			data=value;
			prev=null;
			next=null;
		}
	}
	public DCLL() {
		head=null;
	}
	public void addAtFirst(int value) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
			newnode.next=head;
		}
		else {
			Node current=head;
			while(current.next!=head) {
				current=current.next;
			}
			newnode.next=head;
			newnode.prev=current;
			head=newnode;
			current.next=head;
		}
		System.out.println(value+" added");
	}
	public void addAtEnd(int value) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
			newnode.next=head;
		}
		else {
			Node current=head;
			while(current.next!=head) {
				current=current.next;
			}
			head.prev=newnode;
			current.next=newnode;
			newnode.prev=current.next;
			newnode.next=head;
		}
		System.out.println(value+ "Added!");
	}
	public void addByPos(int pos,int value) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
			newnode.next=head;
		}
		if(pos==1) {
			addAtFirst(value);
		}
		else {
			int i;
			Node trav=head;
			for( i=1;trav.next!=head && i<=pos-2;i++) {
				trav=trav.next;
			}
			if(i==pos-1) {
			newnode.next=trav.next;
			trav.next.prev=newnode.next;
			trav.next=newnode;
			newnode.prev=trav.next;
			}
			else {
				System.out.println("Wrong Position!!");
			}
		}
	}
	public void deletebyval(int value) {
		Node newnode=new Node(value);
		Node current=head;
		while(current.next!=head && current.data!=value) {
			current=current.next;
		}
		if(head==null) {
			System.out.println("List is Empty");
		}
		if(current.data==value) {
			if(current==head) {
				
			}
		}
		
	}
	public void display() {
		Node trav=head;
		while(trav.next!=head) {
			System.out.print(trav.data+"->");
			trav=trav.next;
		}
		System.out.print(trav.data+"->");
	}
}
