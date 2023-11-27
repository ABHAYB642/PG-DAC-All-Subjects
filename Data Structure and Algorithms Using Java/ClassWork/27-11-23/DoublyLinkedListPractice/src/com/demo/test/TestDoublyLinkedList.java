package com.demo.test;

import com.demo.beans.MyDoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		MyDoublyLinkedList ob=new MyDoublyLinkedList();
		ob.addFirst(50);
		ob.addFirst(40);
		ob.addByPosition(30,2);
		ob.addBeforeValue(60,40);
		ob.addAfterValue(100,30);
		ob.addAfterValue(150,50);
		ob.deletebyValue(150);
		ob.displaydata();
	}

}
