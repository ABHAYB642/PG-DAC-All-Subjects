package com.demo.service;

import java.util.List;

import com.demo.beans.Friend;

public interface FriendServiceIF {

	void displayAll();

	void addnewFriend();

	Friend searchbyid(int id);

	List<Friend> searchbyhobby(String hob);

	List<Friend> searchbynm(String nm);

}
