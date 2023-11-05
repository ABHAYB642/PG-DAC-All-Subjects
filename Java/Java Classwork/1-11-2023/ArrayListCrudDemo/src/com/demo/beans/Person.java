package com.demo.beans;

public class Person implements Comparable <Person>{
	private int pid;
	private String name;
	private String mob;
	public Person() {
		super();
	}
	public Person(int pid, String name, String mob) {
		super();
		this.pid = pid;
		this.name = name;
		this.mob = mob;
	}
	public Person(int id) {
		this.pid=id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", mob=" + mob + "]";
	}
	@Override
	public boolean equals(Object o) {
		return this.pid==((Person)o).pid;
		
	}
	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}
	

}
