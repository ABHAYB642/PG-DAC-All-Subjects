package com.demo.dao;

import java.util.Map;

import com.demo.beans.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class CartDaoImpl implements CartDao{
    static String userName;
    static Product product;
    static List <Product> lp = new ArrayList<>();
    static List <User> up = new ArrayList<>();
	static Map <String,Product> mc;
	static
	{
		mc= new HashMap<>();
		Product p = new Product(1,"Cadbury",100,5);
		Product p1 = new Product(2,"KitKat",50,10);
		Product p2 = new Product(3,"Dark Fantasy",80,15);
		Product p3 = new Product(4,"Oreo",30,25);
		Product p4 = new Product(5,"Kurkure",10,50);
		up.add(new User("pratham"));
		up.add(new User("kunal"));
		up.add(new User("rajni"));
		up.add(new User("adi"));
		up.add(new User("vik69"));
		lp.add(p);
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		lp.add(p4);
		mc.put(userName,product);
	}
	
	
	@Override
	public void saveUser(String u) {
	userName=u;		
	}

	@Override
	public void saveProduct(Product p) {
	product =p;
	}

	@Override
	public void findAllProducts() {
		for(Product fp: lp)
		{
			System.out.println(fp);
		}
		
	}
	
	public void searchUser(String searchName)
	{boolean flag= false;
		for(User su : up)
		{
			
			if(su.getUserName().equals(searchName))
			{
				flag= true;
				System.out.println("Welcome");
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Not a user,login first");
		}
	}
	
	public void addCadbury()
	{
		
	}

	
	

}
