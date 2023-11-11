package com.demo.beans;

public class User {

	private String userName;
	
	public User() {
		userName=null;
	}
	public User(String userName)
	{
		this.userName=userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + "]";
	}
	
	
	
}
