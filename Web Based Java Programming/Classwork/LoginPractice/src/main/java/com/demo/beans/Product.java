package com.demo.beans;

public class Product {
	private int pid;
	private String pname;
	private double price;
	private double qty;
	
	public Product() {
		super();
	}
	public Product(int pid, String pname, double price, double qty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + "]";
	}
	

}
