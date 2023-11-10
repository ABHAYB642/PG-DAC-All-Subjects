package com.demo.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Friend;
import com.demo.dao.FriendDaoIF;
import com.demo.dao.FriendDaoclass;

public class FriendServiceclass implements FriendServiceIF{

	private FriendDaoIF fdao;
	public FriendServiceclass() {
		fdao=new FriendDaoclass();
	}
	@Override
	public void displayAll() {
		fdao.displayAll();
		
	}
	@Override
	public void addnewFriend() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter fid : ");
		int fid = sc.nextInt();

		System.out.println("enter fname : ");
		String fname = sc.next();

		System.out.println("enter lastname : ");
		String lastname = sc.next();

		System.out.println("enter no. of hobbies : ");
		int h = sc.nextInt();

		Set<String> hs = new HashSet<String>();
		for (int i = 0; i < h; i++) {
		    System.out.println("enter hobby " + (i+1) + ":");
		    String hobby = sc.next();
		    hs.add(hobby);
		}
		
//		System.out.println("enter no. of hobbies : ");
//		int h = sc.nextInt();
//
//		String[] arr = new String[h];
//
//		for (int i = 0; i < h; i++) {
//			System.out.println("enter hobby " + i + " : ");
//			arr[i] = sc.next();
//		}

		System.out.println("enter mobile : ");
		String mobile = sc.next();

		System.out.println("enter email : ");
		String email = sc.next();
		
		System.out.println("enter address : ");
		String address = sc.next();

		System.out.println("enter birth date (dd/MM/yyyy) : ");
		String bdate = sc.next();
		LocalDate dt2 = LocalDate.parse(bdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Friend f =  new Friend(fid, fname, lastname, hs, mobile, email, Date.valueOf(dt2), address);
		fdao.addnewfrd(f);
	}
	@Override
	public Friend searchbyid(int id) {
		// TODO Auto-generated method stub
		return fdao.searchbyid(id);
	}
	@Override
	public List<Friend> searchbyhobby(String hob) {
		return fdao.searchbyhobby(hob);
	}
	@Override
	public List<Friend> searchbynm(String nm) {
		
		return fdao.searchbyname(nm);
	}

}
