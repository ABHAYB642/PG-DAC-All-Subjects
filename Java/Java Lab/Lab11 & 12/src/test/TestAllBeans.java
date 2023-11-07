package test;

import beans.BoxingUnboxing;
import beans.StringManipulation;

public class TestAllBeans {

	public static void main(String[] args) 
	{
		BoxingUnboxing bu = new BoxingUnboxing(1,10000f,1.1,2,2000f,2.2);
		System.out.println(bu);
		bu.boxing();
		System.out.println();
		
		
		BoxingUnboxing bu1 = new BoxingUnboxing(1,10000f,1.1,2,2000f,2.2);
		System.out.println(bu1);
		bu.unboxing();
		System.out.println();
		
		//Wrapper Class Methods
		//BoxingUnboxing bu2 = new BoxingUnboxing(1,10000f,1.1,2,2000f,2.2);
		System.out.println("Wrapper class methods ");
		System.out.println(bu1);
		bu1.wrapperClassMethods();
		System.out.println();
		
		StringManipulation sm = new StringManipulation();
		System.out.println(sm);
		sm.manipulation();
	}

}
