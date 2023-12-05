
package Hashing;
class singleLinkedList{
	Node head;
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	singleLinkedList(){
		head=null;
	}
	public void addAtStart(int val) {
		Node newnode=new Node(val);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	
	public void search(int val) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==val) {
				System.out.println("Data found");
				return;
			}
			temp=temp.next;
		}
		System.out.println("Data not found");
	}
	public void displaydata() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println();
	}
	
}