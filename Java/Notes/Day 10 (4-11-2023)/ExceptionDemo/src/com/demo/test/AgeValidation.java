package com.demo.test;

import java.util.Scanner;

import com.demo.exceptions.InvalidAgeException;
import com.demo.exceptions.InvalidAgeException1;

public class AgeValidation {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
	try {
		for(int i=0;i<3;i++)	
		{
			try {
				System.out.println("Enter the age");
				int age=sc.nextInt();
				
				if(age>18 && age<60)
				{
					System.out.println("Valid age");
					break;	
				}		
				else {
					throw new InvalidAgeException("age shld be between 18 and 60");
				}
			}catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
				if(i==2)
				{
					throw new InvalidAgeException1("You are reached to 3 attempts please try later");
				}
			}
		}
		
	}catch(InvalidAgeException1 e) {
		System.out.println(e.getMessage());
	}
		
	}	
}


