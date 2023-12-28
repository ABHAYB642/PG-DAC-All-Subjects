package com.demo.service;

import com.demo.beans.User;
import com.demo.dao.*;
public class ProductService implements ProductServiceInterface{

	ProductDaoInterface pdao=new ProductDao();
	
	@Override
	public User validateUser(String uname, String pass) {
		return pdao.validateuser(uname,pass);
	}

	@Override
	public boolean updatepass(String uname, String pass) {
		
		return pdao.updatepass(uname,pass);
	}

}
