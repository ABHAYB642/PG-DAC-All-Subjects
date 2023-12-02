package com.demo.test;

import com.demo.beans.DCLL;

public class TestDCLL {
	public static void main(String[] args) {
		DCLL ob=new DCLL();
		ob.addAtFirst(30);
		ob.addAtFirst(20);
		ob.addAtFirst(10);
		ob.addAtEnd(40);
		ob.addByPos(6, 26);
		ob.display();
	}
}
