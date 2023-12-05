package com.demo.beans;



public class SinglyCircular {
	
	Node head;
	class Node{
		Node next;
		int data;
		Node(){
			next=null;
		}
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public SinglyCircular() {
		head=null;
	}
	
	public boolean addByPos(int value,int pos) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
			newnode.next=head;
			return true;
		}
		else if(pos==1) {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			newnode.next=head;
			head=newnode;
			temp.next=head;
			return true;
		}
		else {
			Node temp=head;
		    int i;
			for(i=1;temp.next!=head && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(i==pos-1) {
				newnode.next=temp.next;
				temp.next=newnode;
				return true;
			}
			else {
				System.out.println("Wrong Position");
				return false;
			}
		}
	}
	
	public boolean deletebypos(int pos) {
		if(head==null) {
			return false;
		}
		else if(pos==1) {
			Node temp=head;
			Node current=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=head.next;
			head=head.next;
	        current.next=null;
	        current=null;
	        return true;
		}
		else {
			Node prev=head;
			Node current=head.next;
			int i;
			for(i=1;current.next!=head && i<=pos-2;i++) {
				prev=current;
				current=current.next;
			}
			
			if(i==pos-1) {
				prev.next=current.next;
				current.next=null;
		        current=null;
		        return true;
			}
			else{
				System.out.println("Wrong Position");
				return false;
			}
		}
		
	}
	 public void displaydata() {
	    	Node temp=head;
	    	while(temp.next!=head) {
	    		System.out.println(temp.data);
	    		temp=temp.next;
	    	}
	    	System.out.println(temp.data);
	    }
	

}
