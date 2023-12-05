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
		for(int i=0;i<3;i++) {
			System.out.println("Enter Data");
			int n=sc.nextInt();
			lst.add(n);
		}
		System.out.println("List IS:-");
		for(Integer i:lst)
		{
			System.out.println(i);
		}
		System.out.println("SUM IS:-");
		int sum=0;
		for(Integer i:lst)
		{
			sum=sum+i;	
		}
		System.out.println(sum);
		
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
		System.out.println("After Deletion List IS:-");
			for(Integer i:lst)
			{
				System.out.println(i);
			}
	}}
//Also We Can Remove by 
//		lst.remove(new Integer(num));
//		Predicate p=(x)->(int)x==num;
//		lst.removeIf(p);
//		//delete all the occurances of num from ArrayList
//				lst.removeIf((x)->(int)x==(num));
//	}


