package com.demo.beans;

public class CircularLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int n) {
			data=n;
			next=null;
		}
	}
	private Node head;
	public CircularLinkedList() {
		head=null;
	}
	public void addnodeByPosition(int pos,int value){
		Node newnode=new Node(value);
		//if linked list is empty
		if(head==null) {
			head=newnode;
			newnode.next=head;
		}else {
			//if linked list is not empty, and add at the begining
			if(pos==1) {
				Node temp=head;
				while(temp.next!=head) {
					temp=temp.next;
				}
				newnode.next=head;
				head=newnode;
				temp.next=head;
			}else {
				//add in between or add at the end
				Node temp=head;
				int i;
				for(i=1;temp.next!=head && i<=pos-2;i++) {
					temp=temp.next;
				}
				//if(i>=pos-1)
					newnode.next=temp.next;
					temp.next=newnode;
				//}
				
			}
		}
	}
	
	public void deleteByKey(int n){
		Node prev=null;
		Node current=head;
		//till we reach to last node
		while(current.next!=head && current.data!=n) {
			prev=current;
			current=current.next;
		}
		if(current.data==n) {
			//delete from the begining
			if(current==head) {
				Node current=temp;
				while(current.next!=head) {
					current=current.next;
				}
				current.next=temp.next;
				head=head.next;
				temp.next=null;
				temp=null;
			}
			//delete from in between or delete from the end
			else {
				prev.next=temp.next;
				temp.next=null;
				temp=null;
			}
			
		}
		
	}
	
	public void displaydata() {
		Node temp=head;
		while(temp.next!=head) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		//to display last node value
		System.out.println(temp.data);
	}
	

}
