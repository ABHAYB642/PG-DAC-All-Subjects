package com.demo.beans;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

public class Friend {
	private int id;
	private String name;
	private String lastname;
	private Set<String> hobbies;
	private String Mob;
	private String email;
	private Date bdate;
	private String address;
	
	public Friend() {
		super();
	}

	public Friend(int id, String name, String lastname, Set<String> hobbies, String mob, String email, Date bdate,
			String address) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.hobbies = hobbies;
		this.Mob = mob;
		this.email = email;
		this.bdate = bdate;
		this.address = address;
	}

	public Friend(int id) {
		this.id=id;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getMob() {
		return Mob;
	}

	public void setMob(String mob) {
		Mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public boolean equals(Object obj) {
		
		return this.id == ((Friend)obj).id;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", name=" + name + ", lastname=" + lastname + ", hobbies=" + hobbies + ", Mob="
				+ Mob + ", email=" + email + ", bdate=" + bdate + ", address=" + address + "]";
	}
	
	
}
