package com.demo.beans;

public class DoublyCicularLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
	    Node prev;
	    
	    public Node(int n) {
	    	this.data=n;
	    	next=null;
	    	prev=null;
	    }
	}
	public DoublyCicularLinkedList(){
		head=null;
	}
	public boolean addAtStart(int n) {
		Node newnode=new Node(n);
		if(head==null) {
			head=newnode;
			newnode.next=head;
			return true;
		}
		else {
			Node temp=head;
			
			
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			newnode.next=head;
			newnode.prev=temp;
			head=newnode;
			temp.next=head;
			return true;
//			Node current=head;
//			while(current.next!=head) {
//				current=current.next;
//			}
//			newnode.next=head;
//			newnode.prev=current;
//			head=newnode;
//			current.next=head;
		}
	}
	public boolean addAtend(int n) {
		Node newnode=new Node(n);
		if(head==null) {
			head=newnode;
			newnode.next=head;
			return true;
		}else {
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			if(temp.next==head) {
				newnode.next=head;
				newnode.prev=temp;
				temp.next=newnode;
				return true;
			}
			
		}
		return false;
	}
	public boolean addbypos(int val,int pos) {
		Node newnode=new Node(val);
		if(head==null && pos!=1) {
			System.out.println("LIST IS EMPTY");
		}
		else {
			if(pos==1)
			{
				addAtStart(val);
			}
			else {
				Node temp=head;
				int i;
				for(i=1;temp.next!=head && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(i==pos-1) {
					newnode.next=temp.next;
					newnode.prev=temp;
					temp.next.prev=newnode;
					temp.next=newnode;
					return true;
				}
				else
				{
					System.out.println("Pos is wrong");
					return false;
				}
			}
		}
		return false;
	}
	
	
	public boolean deleteAtPos(int pos) {
		if(head==null) {
			System.out.println("List is Empty");
			return true;
		}
		else {
			if(pos==1) {
				Node temp=head;
				Node current=head;
				while(temp.next!=head)
				{
					temp=temp.next;
				}
				head=head.next;
				temp.next=head;
				current.next=null;
				current=null;
				return true;
			}
			else {
				Node temp=head;
				Node current=head.next;
				int i;
				for( i=1;i<=pos-2 && current.next!=head;i++) {
					temp=temp.next;
					current=current.next;
				}
				if(i==pos-1) {
					temp.next=current.next;
					current.next.prev=temp;
					current.next=null;
					current=null;
					return true;
				}
				else {
					System.out.println("Wrong Position");
					return false;
				}
				
			}
		}
	
	}
	
	public boolean deleteByValue(int value) {
		if(head==null) {
			System.out.println("List Is Empty");
		}
		else {
			Node current=head;
			if(current.data==value) {
				Node temp=head;
				while(temp.next!=head)
				{
					temp=temp.next;
				}
				head=head.next;
				temp.next=head;
				current.next=null;
				current=null;
				return true;
			}
			else {
			while(current.data!=value && current.next!=head) {
				current=current.next;
			}
			if(current.data==value) {
			current.prev.next=current.next;
			current.next.prev=current.prev;
			current.next=null;
			current=null;
			return true;
			}
			else {
				System.out.println("Position is Wrong");
				return false;
			}
		}
		}
		return false;
	}
	
	
	public void display() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}


