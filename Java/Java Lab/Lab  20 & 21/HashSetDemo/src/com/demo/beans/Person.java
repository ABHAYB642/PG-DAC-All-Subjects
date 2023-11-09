package com.demo.beans;

public class Person implements Comparable<Person>{

	private int pid;
	private String pname;
	private String mobile;
	private String email;
	
	public Person(int id1) {
		this.pid=id1;
	}

	public Person(int pid, String pname, String mobile, String email) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mobile = mobile;
		this.email = email;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + ", email=" + email + "]";
	}
	

	//overrided equals method for checking child's pid and given pid
	public boolean equals(Object ob)
	{
		return this.pid== ((Person)ob).pid;
	}
	public int compareTo(Person p)
	{
		System.out.println("In Person compareTo method"+this.pname+"--->"+p.pname);
		return this.pname.compareTo(p.pname);
	}
	
	public int hashCode()
	{
		return pid;
	}
	
	
	
}
