package com.demo.test;

import com.demo.beans.SinglyLinkedListClass;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedListClass ob=new SinglyLinkedListClass();
        ob.addElement(12,1);
        ob.addElement(13,2);
        ob.addElement(14,1);
        ob.display();
        ob.deleteElement(5000);
        ob.display();
	}

}
