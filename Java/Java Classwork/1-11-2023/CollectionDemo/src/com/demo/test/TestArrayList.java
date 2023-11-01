package com.demo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<Integer> lst=new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Enter Data");
			int n=sc.nextInt();
			lst.add(n);
		}
		for(Integer i:lst)
		{
			System.out.println(i);
		}
		int s=0;
		for(Integer i:lst)
		{
			s=s+i;	
		}
		System.out.println(s);
		
		//to remove the values
		Iterator <Integer> it = lst.iterator();
		System.out.println("Enter no for delete");
		int num=sc.nextInt();
		while(it.hasNext())
		{
			int n=it.next();
			if(n==num)
			{
				it.remove();
			}
		}
		
		//
		lst.remove(new Integer(num));
		Predicate p=(x)->(int)x==num;
		lst.removeIf(p);
		//delete all the occurances of num from ArrayList
				lst.removeIf((x)->(int)x==(num));
	}

}
