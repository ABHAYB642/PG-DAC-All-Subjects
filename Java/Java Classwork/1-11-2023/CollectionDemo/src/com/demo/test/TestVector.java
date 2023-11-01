package com.demo.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
	
//		Vector v = new Vector();
//		v.add(10);
//		v.add("test");
		
		Vector <String> v1=new Vector<>();
		v1.add("hi");
		//v.add(23);
		Vector <Integer> v=new Vector<>();
		//List <Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println(v.get(0));
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		
		for(int i=0;i<10;i++)
		{
			v.add(i+100);
		}
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		          //to display data
//		for(int i=0;i<v.size();i++)
//		{
//			System.out.println(v.get(i));
//		}
//		for(Integer num:v)
//		{
//			System.out.println(num);
//		}
		v.stream().forEach(x->System.out.println(x));
		v.stream().forEach(System.out::println);
		
		Enumeration e=v.elements();
		System.out.println("Using enumeration");
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+"\t");
		}
		
		Iterator <Integer> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+"\t");
		}
		ListIterator <Integer> ltr=v.listIterator();
		while(ltr.hasNext())
		{
			System.out.print(ltr.next()+"\t");
		}
		System.out.println();
		while(ltr.hasPrevious())
		{
			System.out.print(ltr.previous()+"\t");
		}
		System.out.println(v.contains(30)); //true
		
		
		
	}

}
