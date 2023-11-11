package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Friend;
import com.demo.services.FriendsService;
import com.demo.services.FriendsServiceImpl;

public class TestfriendDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FriendsService fservice = new FriendsServiceImpl();
		int choice = 0;

		do {
			System.out.println("\n1.Display All Friend\n" + "2. Search by id\n" + "3. Search by name\n"
					+ "4. Display all friend with a particular hobby\n" + "5. Add new Friend" + "\n6. Exit");
			System.out.println("enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				List<Friend> f1 = fservice.displayall();
				System.out.println(f1);
				break;

			case 2:
				System.out.println("enter id");
				int id = sc.nextInt();
				Friend f = fservice.serachById(id);
				System.out.println(f);
				if (f != null) {
					System.out.println(f);
				} else {
					System.err.println("Id not found..");
				}
				break;

			case 3:
				System.out.println("enter name");
				String nm = sc.next();
				f = fservice.serachByName(nm);
				if (f != null) {
					System.out.println(f);
				} else {
					System.err.println("Friend not found..");
				}
				break;

			case 4:
				System.out.println("enter hobby");
				String hm = sc.next();
				List<Friend> f2 = fservice.diplayByHobby(hm);
				System.out.println(f2);
				break;

			case 5:
				fservice.addnewfriend();
				break;

			case 6:
				System.out.println("You are exit now..");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong choice..");
				break;

			}

		} while (true);

	}

}
