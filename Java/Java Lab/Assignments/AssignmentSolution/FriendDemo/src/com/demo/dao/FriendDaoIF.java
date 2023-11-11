package com.demo.dao;

import java.util.List;

import com.demo.beans.Friend;

public interface FriendDaoIF {

	void displayAll();

	void addnewfrd(Friend f);

	Friend searchbyid(int id);

	List<Friend> searchbyhobby(String hob);

	List<Friend> searchbyname(String nm);

}
