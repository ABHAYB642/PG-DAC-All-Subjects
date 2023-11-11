package com.demo.test;

import java.util.Scanner;

import com.demo.services.ExamServices;
import com.demo.services.ExamServicesImpl;

public class TestExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ExamServices eservice = new ExamServicesImpl();
		int choice = 0;

		do {
			System.out.println("Select name of exam \n1.JAVA\n2.HTML");
			System.out.println("enter choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				eservice.javaexam();
				System.out.println("Do you want to continue? Y/N");
				String ch = sc.next();
				if (ch.equals("N")) {
					System.exit(0);
				}
				break;

			case 2:
				eservice.htmlexam();
				System.out.println("Do you want to continue? Y/N");
				String ch1 = sc.next();
				if (ch1.equals("N")) {
					System.exit(0);
				}
				break;

			default:
				System.out.println("wrong choice..");
				System.exit(0);
			}

		} while (true);

	}

}
