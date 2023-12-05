package com.demo.beans;

public class SinglyLinkedListClass {
private Node head;
		class Node{
			int data;
			Node next;
			Node(){
				next=null;
			}
			Node(int n){
				this.data=n;
			}
		}
public SinglyLinkedListClass() {
	head=null;
}
public boolean addElement(int n,int pos) {
	Node temp=new Node(n);
	if(head==null && pos!=1) {
		System.out.println("List is Empty");	
	}
	if(head==null) {           
		
		head=temp;
		temp.next=null;
		return true;
	}
	else if(pos==1) {
		temp.next=head;
		head=temp;
		return true;
	}
	else {
		Node prev;
		prev=head;
		for(int i=1;prev!=null && i<=pos-2;i++) {
			prev=prev.next;
		}
		
		if(prev!=null) {
			temp.next=prev.next;
			prev.next=temp;
			return true;
		}
		else {
			System.out.println("Wrong Position");
			return false;
		}
	}
}

public boolean deleteElement(int pos) {
	if(head==null) {
		System.out.println("List is empty");
		return false;
	}
	else if(pos==1) {
			Node temp;
			temp=head;
			head=head.next;
			temp.next=null;
			return true;
		}
	else {
		Node prev=head;
		Node current=head.next;
		for(int i=1;current!=null && i<=pos-2;i++) {
			prev=prev.next;
			current=current.next;
		}
		if(current!=null) {
			prev.next=current.next;
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


public void display() {
	Node temp;
	temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
}

