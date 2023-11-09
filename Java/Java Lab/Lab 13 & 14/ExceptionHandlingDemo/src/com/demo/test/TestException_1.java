package com.demo.test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException_1 {

	private static int divide(int num1, int num2) {
	try {
		return num1/num2;
	    }catch(ArithmeticException e)
	      { 
	    	 System.out.println("using throw");
	    	 throw e;
	      }catch(InputMismatchException e)
	      {
	    	throw e;  
	      }
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		String  str = null;
		System.out.println("String : " + str + "String Length : " + str.length());
		}catch(NullPointerException e)
		    { 
			     System.out.println("String is null");
		         System.out.println(e.getMessage());	
	    	}
		System.out.println("-------------------------------");
		
		try {
		System.out.println("enter the num1 : ");
		int num1 = sc.nextInt();
		System.out.println("enter the num2 : ");
		int num2 = sc.nextInt();
		int ans=divide(num1,num2);
		System.out.println("Dividation ans : " + ans);	
		}catch(ArithmeticException e)
		{ 
			   System.out.println("Arithmetic Exception occur");
		       System.out.println(e.getMessage());
		}catch(InputMismatchException e)
		{ 
			   System.out.println("InputMismatch Exception occur");
		       System.out.println(e.getMessage());
		}
	}
}
