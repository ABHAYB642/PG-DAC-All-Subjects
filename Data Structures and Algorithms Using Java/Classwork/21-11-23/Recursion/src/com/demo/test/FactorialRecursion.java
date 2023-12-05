package com.demo.test;

import java.util.Scanner;

public class FactorialRecursion {
	
	
	private static int recursionfact(int n) {
		if(n==1)
		{
			return 1;
		}
		return n*recursionfact(n-1);
	}

	
	//Recursion fact -ve no
//	private static int recursionfact(int n) {
//		if(n==-1)
//		{
//			return -1;
//		}
//		
//		return n*recursionfact(n+1);
//	}
	public static void main(String[] args) {
		System.out.println("Enter Number");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n<0) {
	    	System.out.println("Enter Positive no");
	    }
	    else {
	    	System.out.println("Sum = "+recursionfact(n));
	    }
	    sc.close();

	}



}
