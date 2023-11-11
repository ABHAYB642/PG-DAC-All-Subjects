package com.demo.beans;

public class Member extends Person {
	private String type_of_mem;
	private double charges;

	public Member() {
		super();
	}

	public Member(int id, String name, String mobno, String email, String type_of_mem, double charges) {
		super(id, name, mobno, email);
		this.type_of_mem = type_of_mem;
		this.charges = charges;
	}

	public String getType_of_mem() {
		return type_of_mem;
	}

	public void setType_of_mem(String type_of_mem) {
		this.type_of_mem = type_of_mem;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return super.toString() + "Member [type_of_mem=" + type_of_mem + ", charges=" + charges + ", toString()=" + "]";
	}

}
