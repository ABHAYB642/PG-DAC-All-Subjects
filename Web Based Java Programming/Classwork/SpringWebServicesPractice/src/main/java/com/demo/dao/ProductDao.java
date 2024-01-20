package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	List<Product> getAllproduct();

	Product getByid(int pid);

	void save(Product p);

	void modifyProduct(Product product);

	void removeById(int id);

}
