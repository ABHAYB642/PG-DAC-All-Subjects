package com.demo.beans;

public class Person implements Comparable<Person> {
	private int id;
	private String name;
	private String mobno;
	private String email;

	public Person() {
		super();
	}

	public Person(int id1) {
		this.id = id1;
	}

	public Person(int id, String name, String mobno, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		this.email = email;
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

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobno=" + mobno + ", email=" + email + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return id == other.id;
//	}
	/*
	 * @Override public boolean equals(Object obj) { // Person other = (Person) obj;
	 * return this.id == ((Person) obj).id; }
	 * 
	 * public int compareTo(Employee p) { //
	 * System.out.println("In Person compareTo method" + this.name + "--->" + //
	 * p.name); return this.name.compareTo(((Person) p).name); }
	 * 
	 * @Override public int hashCode() { return id; }
	 */
	public boolean equals(Object ob) {
		return this.name == ((Person) ob).name;
	}

	public int compareTo(Person p) {
		System.out.println("In Person compareTo method" + this.name + "--->" + p.name);
		return this.name.compareTo(p.name);
	}

	public int hashCode() {
		return id;
	}
}
