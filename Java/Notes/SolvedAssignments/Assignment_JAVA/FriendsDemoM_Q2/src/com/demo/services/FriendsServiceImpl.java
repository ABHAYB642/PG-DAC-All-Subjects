package com.demo.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Friend;
import com.demo.dao.FriendsDao;
import com.demo.dao.FriendsDaoImpl;

public class FriendsServiceImpl implements FriendsService {

	private FriendsDao fdao;

	public FriendsServiceImpl() {
		fdao = new FriendsDaoImpl();
	}

	@Override
	public List<Friend> displayall() {
		return fdao.dispall();

	}

	@Override
	public Friend serachById(int id) {
		return fdao.searchfriend(id);
	}

	@Override
	public void addnewfriend() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter fid : ");
		int fid = sc.nextInt();

		System.out.println("enter fname : ");
		String fname = sc.next();

		System.out.println("enter lastname : ");
		String lastname = sc.next();

		System.out.println("enter no. of hobbies : ");
		int h = sc.nextInt();

		String[] arr = new String[h];

		for (int i = 0; i < h; i++) {
			System.out.println("enter hobby " + i + " : ");
			arr[i] = sc.next();
		}

		System.out.println("enter mobile : ");
		String mobile = sc.next();

		System.out.println("enter email : ");
		String email = sc.next();
		
		System.out.println("enter address : ");
		String address = sc.next();

		System.out.println("enter birth date (dd/MM/yyyy) : ");
		String bdate = sc.next();
		LocalDate dt2 = LocalDate.parse(bdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Friend f = new Friend(fid, fname, lastname, arr, mobile, email, address,dt2);
		fdao.addnewfrd(f);
	}

	@Override
	public Friend serachByName(String nm) {
		return fdao.searchfrd(nm);
	}

	@Override
	public List<Friend> diplayByHobby(String hm) {
		// TODO Auto-generated method stub
		return fdao.FindAllbyHobbies(hm);
	}

}
