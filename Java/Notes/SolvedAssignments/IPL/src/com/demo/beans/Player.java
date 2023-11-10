package com.demo.beans;

import java.util.Objects;

public class Player{
	private int pid;
	private String pname;

	@Override
	public boolean equals(Object obj) {
		return pid == ((Player)obj).pid;
	}





  public Player(int pid) {
	super();
	this.pid = pid;
}


public Player() {
		super();
	}


public Player(int pid, String pname) {
	super();
	this.pid = pid;
	this.pname = pname;
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


@Override
public String toString() {
	return "Player [pid=" + pid + ", pname=" + pname + "]";
}
  
}
