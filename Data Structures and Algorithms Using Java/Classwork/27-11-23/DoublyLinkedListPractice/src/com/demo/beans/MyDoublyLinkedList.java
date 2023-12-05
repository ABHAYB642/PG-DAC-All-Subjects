package com.demo.beans;



public class MyDoublyLinkedList {
	Node head;
	
	class Node {
		int data;
		Node prev;
		Node next;
		public Node(){
			next=null;
			prev=null;
		}
		public Node(int n){
			this.data=n;
			next=null;
			prev=null;
		}
	}
	public MyDoublyLinkedList(){
		head=null;
	}
	
	public boolean addFirst(int value) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
			return true;
		}
		else {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
			return true;
		}
	}
	
	public boolean addByPosition(int value,int pos) {
		
		if(head==null && pos!=1) {
			System.out.println("List is Empty");
		}
		else {
			Node newnode=new Node(value);
			if(pos==1) {
			addFirst(value);
			}
			else {
				Node temp=head;
				for(int i=1;temp!=null && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					if(temp.next!=null) {
					newnode.next=temp.next;
					temp.next.prev=newnode;
					newnode.prev=temp;
					temp.next=newnode;
					return true;
				}
					else {
						addEnd(value);
					}
				}
				
//				
				else {
					System.out.println("Position is Wrong");
					return false;
				}	
			}
		}
		return false;
	}
	
	public boolean addEnd(int value) {
		Node newnode=new Node(value);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		if(temp.next==null) { 
			newnode.prev=temp;
			newnode.next=temp.next;
			temp.next=newnode;
			return true;
		}
		return false;
	}
	 public void displaydata() {
	    	Node temp=head;
	    	while(temp!=null) {
	    		System.out.println(temp.data);
	    		temp=temp.next;
	    	}
	    }
	 
	 public boolean deletebyValue(int value) {
		 if(head==null) {
			 System.out.println("List is Empty");
			 return false;
		 }
		 Node temp=head;
		 while(temp!=null && temp.data!=value) {
			 temp=temp.next;
		 }
		 if(temp!=null) {
			 if(temp==head) {
				 head=head.next;
				 temp.next=null;
				 temp=null;
				 return true;
			 }
			 else if(temp!=head) {
				 if(temp.next!=null) {
					 temp.prev.next=temp.next;
					 temp.next.prev=temp.prev;
					 temp.prev=null;
					 temp=null;
					 return true;
				 }
				 else {
					 deleteAtEnd();
					 
				 }
			 }
		 }
		 else {
			 System.out.println("Position is Wrong");
			 return false;
		 }
return false;
	 }
	 

public boolean addBeforeValue(int addvalue,int value) {
	Node newnode=new Node(addvalue);
	if(head.data==value) {
		addFirst(addvalue);
	}
	else {
		Node temp=head;
		while(temp!=null && temp.data!=value) {
			temp=temp.next;
		}
		if(temp!=null) {
			temp.prev.next=newnode;
			newnode.next=temp;
			newnode.prev=temp.prev;
			temp.prev=newnode;
			return true;
		}
		else {
			System.out.println("Value Not Found");
			return false;	
		}
	}
	return false;
}


public boolean addAfterValue(int addvalue,int value) {
	Node newnode=new Node(addvalue);
		Node temp=head;
		while(temp!=null && temp.data!=value) {
			temp=temp.next;
		}
		if(temp!=null) {
			if(temp.next==null) {
				addEnd(addvalue);
			}
			else {
			newnode.next=temp.next;
			newnode.prev=temp;
			temp.next.prev=newnode;
			temp.next=newnode;
			return true;
		}}
		else {
			System.out.println("Value Not Found");
			return false;	
		}
		return false;
	}
	


private boolean deleteAtEnd() {
	Node temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.prev.next=temp.next;
	temp=null;
	return true;
}
}



	
	 
	 
	

