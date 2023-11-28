package reverseLinkedList;

public class singlyLL {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	singlyLL(){
		head=null;
	}
	public void add(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {

			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void  reverse() {
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;		
			curr=next;
		}
		
		head=prev;
	}
}
