package com.demo.service;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.CartDao;
import com.demo.dao.CartDaoImpl;

public class CartServiceImpl implements CartService {
Scanner sc = new Scanner(System.in);
private CartDao cd;
public CartServiceImpl()
{
cd=new CartDaoImpl();	
}


	@Override
	public void addUser() {
		
		System.out.println("Enter UserName");
		String userName=sc.nextLine();	
	}

	@Override
	public void addProduct() {
		System.out.println("Enter Product Id :");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Product Name :");
		String name=sc.nextLine();
		System.out.println("Enter Product Price :");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Product Quantity :");
		int quant=sc.nextInt();
		
		Product p = new Product(id,name,price,quant);
		
		
	}

	@Override
	public void displayAllProduct() {
		cd.findAllProducts();
		
	}


	@Override
	public void searchUser(String u) {
		
		cd.searchUser(u);
		
	}

}
