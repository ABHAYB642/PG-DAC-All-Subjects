package com.demo.test;
import java.util.Scanner;

import com.demo.exceptions.wrongNumberException;

public class TestGuessNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int num = 67;
		while(true) {
		try {
	    System.out.println("enter number : ");
		int num1 = sc.nextInt();
		
			if(num==num1)
			{
				System.out.println("Yes..! you got number");
				break;
			}
			else
			{
				throw new wrongNumberException("You lost one attempt..");
			}
		 }catch(wrongNumberException e)
			{
				System.out.println(e.getMessage()); 
			}
		}
	}

}
