package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.enums.Gender;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter person id : ");
		int id = sc.nextInt();
		System.out.print("Enter prson name : ");
		String name = sc.next();
		System.out.print("Enter gender : ");
		String gender = sc.next();

		switch (gender.toLowerCase()) {
		case "male":
			Gender c = Gender.Male;
			Person p = new Person(id, name, c);
			System.out.println("you selected " + c.display());
			System.out.println(p);
			break;
		case "female":
			c = Gender.Female;
			p = new Person(id, name, c);
			System.out.println("you selected" + c.display());
			System.out.println(p);
			break;
		default:
			System.out.println("Select correct option");
		}

	}

}
