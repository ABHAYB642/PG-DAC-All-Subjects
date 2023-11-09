package com.demo.test;
import java.util.Scanner;

import com.demo.exceptions.InvalidAgeException;

public class TestAgeException {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	for(int i=0;i<3;i++) {	
		try {
		System.out.println("enter the age : ");
		int age = sc.nextInt();
		
		if(age > 18  && age < 60)
		{
			System.out.println("Valid age..!");
			break;
		}
		else
		{					
	      throw new InvalidAgeException("Invalid Age..!");
	    }
	 }catch(InvalidAgeException e)	
		{
		   System.out.println(e.getMessage());
		}
	}
  }
}
