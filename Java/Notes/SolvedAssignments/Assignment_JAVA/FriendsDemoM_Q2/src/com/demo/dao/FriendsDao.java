package com.demo.dao;

import java.util.List;

import com.demo.beans.Friend;

public interface FriendsDao {

	List<Friend> dispall();

	Friend searchfriend(int id);

	void addnewfrd();

	Friend searchfrd(String nm);

	List<Friend> FindAllbyHobbies(String hm);

	void addnewfrd(Friend f);

}
