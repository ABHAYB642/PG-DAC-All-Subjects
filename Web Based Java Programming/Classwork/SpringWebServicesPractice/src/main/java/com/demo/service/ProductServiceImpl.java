package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao pdao;

	@Override
	public List<Product> getAllproduct() {
		// TODO Auto-generated method stub
		return pdao.getAllproduct();
	}

	@Override
	public Product getProductbyid(int pid) {
		// TODO Auto-generated method stub
		return pdao.getByid(pid);
	}

	@Override
	public void addnewProduct(Product p) {
		pdao.save(p);
		
	}


	@Override
	public void updateById(Product product) {
		pdao.modifyProduct(product);
		
	}

	@Override
	public void deleteById(int id) {
		pdao.removeById(id);
		
	}
}
