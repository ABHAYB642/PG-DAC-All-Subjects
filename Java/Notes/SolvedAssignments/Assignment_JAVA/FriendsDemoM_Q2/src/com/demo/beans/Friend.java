package com.demo.beans;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Friend {

	private int fid;
	private String fname;
	private String lastname;
	private String[] hobbies;
	private String mobile;
	private String email;
	private String address;
	private LocalDate l;

	public Friend() {
		super();
	}

	public Friend(int fid) {
		this.fid = fid;
	}

	public LocalDate getL() {
		return l;
	}

	public void setL(LocalDate l) {
		this.l = l;
	}

	public Friend(int fid, String fname, String lastname, String[] hobbies, String mobile, String email, String address,
			LocalDate l) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.lastname = lastname;
		this.hobbies = hobbies;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.l = l;
	}

	public Friend(int fid2, String fname2, String lastname2, String[] arr, String mobile2, String email2, LocalDate dt2,
			String address2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(fid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		return fid == other.fid;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Friend [fid=" + fid + ", fname=" + fname + ", lastname=" + lastname + ", hobbies="
				+ Arrays.toString(hobbies) + ", mobile=" + mobile + ", email=" + email + ", address=" + address
				+ ", Birth date=" + l + "]";
	}

//	@Override
//	public String toString() {
//		return "Friend [fid=" + fid + ", fname=" + fname + ", lastname=" + lastname + ", hobbies="
//				+ Arrays.toString(hobbies) + ", mobile=" + mobile + ", email=" + email + ", bdate=" + bdate
//				+ ", address=" + address + "]";
//	}
//
//	public int compareTo(Friend f) {
//		System.out.println("In Person compareTo method" + this.fname + "--->" + f.fname);
//		return this.fname.compareTo(f.fname);
//	}

}
