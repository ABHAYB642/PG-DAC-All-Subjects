package com.demo.services;

import java.util.List;

import com.demo.beans.Friend;

public interface FriendsService {

	List<Friend> displayall();

	Friend serachById(int id);

	void addnewfriend();

	Friend serachByName(String nm);

	List<Friend> diplayByHobby(String hm);

}
