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
//		flst.add(new Friend(2,"harsh", "wadwane",hs, "121212","assd@12",
//	            Date.valueOf("1212-12-12"), "sangli"));
//		flst.add(new Friend(2,"harsh", "wadwane",hs, "121212","assd@12",
//	            Date.valueOf("1212-12-12"), "sangli"));
	}
	@Override
	public void displayAll() 
	{
		System.out.println(flst);
		
	}
	@Override
	public void addnewfrd(Friend f) {
		flst.add(f);
		
	}
	@Override
	public Friend searchbyid(int id) {
		int pos=0;
		System.out.println(flst);
		pos=flst.indexOf(new Friend(id));
		System.out.println(pos);
		if(pos!=-1) {
			return flst.get(pos);
		}
		return null;
	}
	
//	public Friend searchbyid(int id) {
//	for(Friend e:flst) {
//		if(e.getId()==id)
//		{
//			return e;
//		}
//	}
//	return null;
//}
	
	
	@Override
	public List<Friend> searchbyhobby(String hob) {
		List<Friend>Samehob=new ArrayList<>();
		Set<String> hs1=new HashSet<>();
		for(Friend f:flst) {
			hs1=f.getHobbies();
			for(String s:hs1) {
				if(s.equals(hob)){
					Samehob.add(f);
				}
			}
		}
		if(Samehob!=null) {
			return Samehob;
		}
		return null;
	}
	@Override
	public List<Friend> searchbyname(String nm) {
		List<Friend>Samenm=new ArrayList<>();
		for(Friend f:flst) {
			if(f.getName().equals(nm)){
				Samenm.add(f);
			}
		}
	if(Samenm!=null) {
		return Samenm;
	}
		return null;
	}
	

	
}
