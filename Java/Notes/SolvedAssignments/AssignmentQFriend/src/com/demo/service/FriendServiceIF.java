package com.demo.service;

import com.demo.beans.Friend;

public interface FriendServiceIF {

	void displayAll();

	void addnewFriend();

	Friend searchbyid(int id);

}
