package circularQueue;

public class circualarQueueUsingLL {
	
	Node head;
	Node front;
	Node rear;
	class Node{
		int data;
		Node next;
		
		
		Node(int val){
			data=val;
			next=null; 
		}
	}
	public boolean isEmpty(){
		return front==null;
	}
	public void add(int data) {
		Node newnode=new Node(data);
		if(front==null && rear==null) {
			front=rear=newnode;			
		}
		rear.next=newnode;
		rear=newnode;
		newnode.next=front;	
	}
	public int size() {
		Node temp=front;
		int size=0;
		while(temp!=null) {
			temp=temp.next;
			size++;
		}
		return size;
	}
	public void addByPosition(int val,int pos) {
		Node newnode=new Node(val);
		
		if(pos<=size()+1 && pos!=0) {
			
			
			if(pos==1 && front!=null) {
				newnode.next=front;
				front=newnode;	
				return;
				
			}
			if(front==null) {
				front=newnode;
			}
			Node temp=front;
			int a=1;
			while(a < pos-1 ) {
				temp=temp.next;
				a++;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
		else {
			System.out.println("Invalid position");
		}
	}
	
	public void display() {
		Node temp=front;
		
		while(temp.next!=front) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
}
