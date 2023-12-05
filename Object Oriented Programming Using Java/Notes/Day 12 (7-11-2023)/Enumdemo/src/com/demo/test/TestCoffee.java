package com.demo.test;

import java.util.Scanner;

import com.demo.enums.Coffee;

public class TestCoffee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coffe size");
		String size = sc.next();

		switch (size) {
		case "small":
			Coffee c = Coffee.small;
			System.out.println("you selected small " + c.getSize() + ",Price : " + c.getPrice());
			break;
		case "medium":
			c = Coffee.medium;
			System.out.println("you selected medium " + c.getSize() + ",Price : " + c.getPrice());
			break;
		case "big":
			c = Coffee.big;
			System.out.println("you selected large " + c.getSize() + ",Price : " + c.getPrice());
			break;
		default:
			System.out.println("Select correct option");
		}

	}

}
