package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.demo.service.*;
import com.demo.beans.Friend;

public class TestFriend {

	public static void main(String[] args) {
		//List<Friend> flst=new ArrayList<>();
		FriendServiceIF f=new FriendServiceclass();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("\n1.Display All Friend\n" + "2. Search by id\n" + "3. Search by name\n"
					+ "4. Display all friend with a particular hobby\n" + "5. Add new Friend" + "\n6. Exit");
			System.out.println("enter your choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				f.displayAll();
				break;
			case 2:
				System.out.println("Enter id to search friend");
				int id=sc.nextInt();
				Friend f1=f.searchbyid(id);
				if(f1!=null)
				{
					System.out.println(f1);
				}
				else {
					System.out.println("Not found");
				}
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				f.addnewFriend();
				break;
			case 6:
				sc.close();
				System.out.println("Thnaks");
				break;
			}
		}while(choice!=6);
	}

}
