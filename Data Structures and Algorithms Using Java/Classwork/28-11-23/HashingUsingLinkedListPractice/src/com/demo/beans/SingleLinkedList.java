package com.demo.beans;

public class SingleLinkedList {
	private Node head;
    class Node{
    	int n;
    	Node next;
    	Node(int d){
    		n=d;
    		next=null;
    	}
    	
    }
    public SingleLinkedList() {
    	head=null;
    }
    
    public void displaydata() {
    	Node temp=head;
    	while(temp!=null) {
    		System.out.print(temp.n + ",");
    		temp=temp.next;
    	}
    	System.out.println();
    }

	public void addatfirst(int i) {
		Node newnode = new Node(i);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
		
	}

	public boolean search(int searchnum) {
		Node temp=head;
		while(temp!=null)
		{
			if(temp.n==searchnum) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
}
