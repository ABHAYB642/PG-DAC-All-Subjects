package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getAllproduct();

	Product getProductbyid(int pid);

	void addnewProduct(Product p);

	void updateById(Product p);

	void deleteById(int pid);

}
