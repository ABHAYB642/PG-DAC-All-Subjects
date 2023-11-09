package com.demo.test;
import java.util.Scanner;

import com.demo.services.LoginService;
import com.demo.exceptions.BloackedAccountException;

public class TestLoginException_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
		for(int i=0;i<3;i++)
		{
			
		try {
		System.out.println("Enter username : ");
		String uname = sc.next();
		System.out.println("Enter password : ");
		String pass = sc.next();

		boolean status = LoginService.Validateuser(uname,pass);
		if(status)
		{
			System.out.println("Login successfully..!");
			break;
		}
		
		}catch(NullPointerException e)
		{
			System.out.println("Error : " + e.getMessage());
			
		}
		if(i==2)
		{ 
			throw new BloackedAccountException("your account is blocked...");
		}
		}
	 }catch(BloackedAccountException e)
		{
		  System.out.println(e.getMessage());
		}
		
	}
	
}
