package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;

public class TestStudent {


	public static void main(String[] args) {
		StudentService s=new StudentService();
		int [] marks=new int[3];
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do {
			System.out.println("1.Add Student \n 2.Display \n3.Exit\n Choice:" );
			choice=sc.nextInt();
			switch(choice) {
		case 1:
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter NAME");
		String sname=sc.next();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Marks");
			marks[i]=sc.nextInt();
		}
		s.addStudent(id,sname,marks);
		break;
		case 2:
				s.display();
		case 3:
			System.out.println("Exited");
			break;
			}
		}while(choice!=3);
		
		//Student s=new Student(id,sname,marks);
	}

}
