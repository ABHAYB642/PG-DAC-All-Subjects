package com.demo.dao;

import com.demo.beans.Friend;

public interface FriendDaoIF {

	void displayAll();

	void addnewfrd(Friend f);

	Friend searchbyid(int id);

}
