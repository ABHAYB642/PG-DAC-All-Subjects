package com.demo.beans;

public class Product {

	private int id;
	private String name;
	private double price;
	private int quant;
	
	public Product() {
		this.id=0;
		this.name=null;
		this.price=0;
		this.quant=0;
	}

	public Product(int id, String name, double price, int quant) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quant = quant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	@Override
	public String toString() {
		return "Id :" + id + ", Name : " + name + ", Price :" + price + ", Quantity :" + quant;
	}
	
	
	
	
}
