package com.demo.test;

import com.demo.beans.SingleLinkedList;

public class TestSingleLinkedList {
	public static void main(String[] args) {
	    SingleLinkedList ob=new SingleLinkedList();
	    
	    ob.addByPosition(12, 1);
		//  ob.displaydata();
	    ob.addByPosition(13, 2);
		System.out.println("lol");
		 ob.displaydata();
	    //  ob.addByPosition(22, 3);
	    // ob.addByPosition(100, 4);
	    // ob.displaydata();
	}
}
