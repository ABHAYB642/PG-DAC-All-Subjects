package com.demo.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TreeCityImp{

	static Set<String> hs=new HashSet<>();
	static HashMap<String,Set<String>> hm = new HashMap<>();
	static {
		hs.add("Neem");
		hs.add("Mango");
		hs.add("Coconut");
		hm.put("Pune", hs);
	}
	public static boolean addTrees(String city) {
		if(hm.containsKey(city)) {
			hm.put(city, hs);
			return true;
		}
		return false;
	}
	public static boolean deleteByCity(String city) {
		if(hm.containsKey(city)) {
			hm.put(city,null);
			return true;
		}
		return false;
	}
	public static boolean AddTreeCity(String city) {
		HashSet ta=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		if(!hm.containsKey(city)) {
			System.out.println("How many Trees You have to add");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				System.out.println("Enter List of Trees"+(i+1));
				String t=sc.next();
				ta.add(t);
			}
			hm.put(city, ta);
			return true;
		}
		return false;
	}
	public static HashMap<String, Set<String>> displayAll() {
        return hm;
	}
	
	
	public static Set<String> FindTrees(String city) {
		HashSet ta=new HashSet<>();
		if(hm.containsKey(city)) {
			hs=hm.get(city);
			return hs;
		}
		return null;
	}
	public static Set<String> Findcitybytree(String tree) {
		HashSet <String>rfct=new HashSet<>();
		HashSet<String> ta=new HashSet<>();
		Set<String> s=hm.keySet();
		//System.out.println(s);
		for(String hs:s) {
			ta=(HashSet) hm.get(hs);
			for(String p:ta) {
				if(p.equals(tree)) {
					rfct.add(hs);
				}
			}
			
		}
		if(rfct!=null) {
			//System.out.println(rfct);
			return rfct;
		}
		return null;
	}
	
}
