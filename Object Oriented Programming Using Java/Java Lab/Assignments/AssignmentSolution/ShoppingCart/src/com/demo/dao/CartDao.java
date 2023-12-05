package com.demo.dao;

import com.demo.beans.Product;

public interface CartDao {
public void saveUser(String u);
public void saveProduct(Product p);
public void findAllProducts();
public void searchUser(String searchName);
}
