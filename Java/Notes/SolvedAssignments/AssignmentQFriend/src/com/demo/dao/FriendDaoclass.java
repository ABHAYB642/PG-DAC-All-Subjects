package com.demo.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.Friend;

public class FriendDaoclass implements FriendDaoIF {
	static List<Friend> flst;
	static Set<String> hs;
	static {
		flst=new ArrayList<>();
		hs=new HashSet<String>();
		hs.add("Listening");
		hs.add("Playing Cricket");
		flst.add(new Friend(1,"harsh", "wadwane",hs, "121212","assd@12",
	            Date.valueOf("1212-12-12"), "sangli"));

	}
	@Override
	public void displayAll() {
		System.out.println(flst);
		
	}
	@Override
	public void addnewfrd(Friend f) {
		flst.add(f);
		
	}
	@Override
	public Friend searchbyid(int id) {
		int pos=flst.indexOf(new Friend(id));
		if(pos!=-1) {
			return flst.get(pos);
		}
		return null;
	}
	
}
