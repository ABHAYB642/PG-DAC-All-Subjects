package com.demo.beans;



public class EmployeeLinkedList {
	Node head;
	class Node{
		Employee e;
		Node next;
		Node(){
			next=null;
		}
		Node(Employee e){
			this.e=e;
			next=null;
		}
	}
	public EmployeeLinkedList() {
		head=null;
	}
	
	public boolean addNewEmpAtEnd(Employee e) {
		Node newnode=new Node(e);
		if(head==null) {
			head=newnode;
		    return true;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			if(temp.next==null)
			{
				temp.next=newnode;
				return true;
			}
		}
		return false;
	}
	
	public boolean searchByID(int id) {
		Node temp=head;
		while(temp!=null && temp.e.getId()!=id) {
			temp=temp.next;
		}
		if(temp!=null) {
		System.out.println(temp.e);
		return true;
		}
		else {
			System.out.println("ID not found");
			return false;
		}
	}
	
	public boolean deletebyID(int id) {
		Node prev=head;
		Node current=head.next;
		while(current!=null && current.e.getId()!=id) {
			current=current.next;
			prev=prev.next;
		}
		if(current!=null) {
			prev.next=current.next;
			current=null;
			return true;
		}
		else {
			System.out.println("ID Not Found");
			return false;
		}
	}

	public void displaydata() {
    	Node temp=head;
    	while(temp!=null) {
    		System.out.println(temp.e);
    		temp=temp.next;
    	}
    }
}


