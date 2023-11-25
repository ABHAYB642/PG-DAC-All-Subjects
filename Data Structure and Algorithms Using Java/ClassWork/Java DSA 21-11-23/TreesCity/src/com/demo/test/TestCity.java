package com.demo.test;
import com.demo.service.*;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class TestCity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1.Add list of trees for a city\n2. Delete List of a particular city\n3.Add new entry in treemap check whether city name already exists");
		System.out.println("4.Display all city names and List of trees (Use Iterator and foreach)\n5.Find List of trees for a city\n6. exit\n7.Accept tree name from user.Display all cities in which the tree exists\nChoice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter City");
			String city=sc.next();
			boolean status=TreeCityImp.addTrees(city);
			if(status) {
				System.out.println("Added successfully");
			}
			else {
				System.out.println("City Not Found");
			}
			break;
		case 2:
			System.out.println("Enter City");
			city=sc.next();
			status=TreeCityImp.deleteByCity(city);
			if(status) {
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("Enter City");
			city=sc.next();
			status=TreeCityImp.AddTreeCity(city);
			if(status) {
				System.out.println("Added successfully");
			}
			else {
				System.out.println("Duplicate City");
			}
			break;
		case 4:
			HashMap<String,Set<String>>AllMap = new HashMap<>();
			AllMap=TreeCityImp.displayAll();
			Set<String> s=AllMap.keySet();
			for(String s1:s) {
				   System.out.println(s1+"--->"+AllMap.get(s1));
			}
			break;
		case 5:
			System.out.println("Enter City");
			city=sc.next();
			Set<String>treelist=TreeCityImp.FindTrees(city);
			if(treelist!=null) {
				for(String t:treelist) {
				System.out.println(t);
			}}
			else {
				System.out.println("Not found");
			}
			break;
		case 6:
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		case 7:
			System.out.println("Enter Tree");
			String tree=sc.next();
			Set<String>TreeCity=TreeCityImp.Findcitybytree(tree);
			if(TreeCity!=null) {
				for(String t:TreeCity) {
				System.out.println(t);
			}}
			else {
				System.out.println("Not found");
			}
			break;
		default:
			System.out.println("Wrong choice");
		}
		}while(choice!=6);
	}

	}
