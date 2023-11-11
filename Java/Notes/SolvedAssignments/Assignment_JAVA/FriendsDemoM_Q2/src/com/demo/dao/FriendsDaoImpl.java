package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Friend;

public class FriendsDaoImpl implements FriendsDao {

	static List<Friend> flist;
	static {
		flist = new ArrayList<>();
//		flist.add(new Friend(1, "harsh", "wadwane", new String[] { "Reading", "dancing" }, "121212", "assd@12",
//				"12/12/1212", "sangli"));
//		flist.add(new Friend(2, "shubham", "Lokhande", new String[] { "Reading", "swimming" }, "66666", "assd@66",
//				"30/06/2025", "Kolhapuri"));
	}

	@Override
	public List<Friend> dispall() {
		return flist;

	}

	@Override
	public Friend searchfriend(int id) {
		int pos = flist.indexOf(new Friend(id));
		if (pos != -1) {
			return flist.get(pos);
		}
		return null;
	}

	@Override
	public void addnewfrd() {
		// flist.add();

	}

	@Override
	public Friend searchfrd(String nm) {
		for (Friend f : flist) {
			if (f.getFname().equals(nm)) {
				return f;
			}
		}
		return null;
	}

	@Override
	public List<Friend> FindAllbyHobbies(String hm) {
		List<Friend> fd = new ArrayList<>();
		for (Friend f : flist) {
			for (String s : f.getHobbies()) {
				if (s.equals(hm)) {
					fd.add(f);
				}
			}
		}
		return fd;

	}

	@Override
	public void addnewfrd(Friend f) {
		flist.add(f);
	}

}
