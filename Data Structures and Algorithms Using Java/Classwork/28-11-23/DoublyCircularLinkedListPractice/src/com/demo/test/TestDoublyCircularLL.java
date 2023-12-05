package com.demo.test;

import com.demo.beans.DoublyCicularLinkedList;

public class TestDoublyCircularLL {

	public static void main(String[] args) {
		DoublyCicularLinkedList ob = new DoublyCicularLinkedList();
		ob.addAtStart(11);
		ob.addAtStart(12);
		ob.addAtStart(13);
		ob.addAtend(14);
		ob.addAtend(15);
		//ob.deleteAtPos(1);
		ob.deleteByValue(13);
		ob.display();
		

	}

}
