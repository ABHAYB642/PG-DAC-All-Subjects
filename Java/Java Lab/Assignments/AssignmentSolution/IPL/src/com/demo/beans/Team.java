package com.demo.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Team {
	
	
	
	private int tid;
	private String tname;
	private String coachname;
	private List<Player> plist;
	
	
	public Team() {
		plist=new ArrayList<>();
	}
    
	
	public Team(int tid) {
		super();
		this.tid = tid;
	}


	public Team(int tid, String tname, String coachname, List<Player> plist) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.coachname = coachname;
		this.plist = plist;
	}
	
	

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getCoachname() {
		return coachname;
	}

	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}

	



	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", coachname=" + coachname + ", plist=" + plist + "]";
	}


	public List<Player> getPlist() {
		return plist;
	}


	public void setPlist(List<Player> plist) {
		this.plist = plist;
	}


	@Override
	public boolean equals(Object obj) {

		return this.tid == ((Team)obj).tid;
	}
	
	
	
	
}
