package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public List<Product> getAllproduct() {
		return jdbctemplate.query("select * from product", (rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			p.setQty(rs.getInt(4));
			return p;
		});
	}

	@Override
	public Product getByid(int pid) {
		
		return jdbctemplate.queryForObject("select * from product where pid=?", new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
	}

	@Override
	public void save(Product p) {
		String str="insert into product values(?,?,?,?)";
		jdbctemplate.update(str,new Object[] {p.getPid(),
				p.getPname(),p.getPrice(),p.getQty()});
		
	}

	@Override
	public void modifyProduct(Product product) {
		jdbctemplate.update("update product set pname=?,qty=?,price=? where pid=?",
				new Object[] {product.getPname(),product.getQty(),product.getPrice(),product.getPid()});
		
		
	}

	@Override
	public void removeById(int id) {
		jdbctemplate.update("delete from product where pid=?",new Object[] {id});
		
	}
}
