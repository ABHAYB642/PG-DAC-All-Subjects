package com.demo.test;

import com.demo.beans.QueueLinkedList;



public class TestQueueLinkedList {

	public static void main(String[] args) {
		 QueueLinkedList ob=new QueueLinkedList();
		
		 ob.enqueue(12);
		 ob.enqueue(13);
		 ob.enqueue(14);
		
		 System.out.println("Dequed Element is "+ob.dequeue());
		 ob.displaydata();
		
		

	}

	

}
