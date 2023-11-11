package com.demo.Dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.demo.Beans.Student;

public class DaoImpl implements DaoIf {
	// static List<String> ski;
	static Map<Student, List<String>> hm;
	static {
		hm = new HashMap<>();
		hm.put(new Student(1, "Shantanu", LocalDate.of(2001, 03, 22), "PGDAC", 81),
				new ArrayList<>(Arrays.asList("Reading", "Dancing", "Watching TV")));
		hm.put(new Student(2, "Harshwardhan", LocalDate.of(2001, 02, 19), "BTech", 98),
				new ArrayList<>(Arrays.asList("Reading", "Dancing", "Swimming")));
		hm.put(new Student(3, "Shubham", LocalDate.of(2001, 04, 20), "BE", 85),
				new ArrayList<>(Arrays.asList("Reading", "Dancing", "Eating")));
	}

	@Override
	public void save(Student s, List<String> sk) {
		if (!hm.containsKey(s.getSid())) {
			hm.put(s, sk);
		}
	}

	@Override
	public void addSkill(int id, String string) {
		Set<Student> eList = hm.keySet();
		List<String> ll = new ArrayList<>();

		for (Student s : eList) {
			if (s.getSid() == id) {
				ll = hm.get(s);
				ll.add(string);
				hm.put(s, ll);
			}
		}
		System.out.println(hm);
	}

	@Override
	public void removeID(int id) {
		ArrayList<Student> eList = new ArrayList<>(hm.keySet());
		for (Student s : eList) {
			if (s.getSid() == id) {
				hm.remove(s);
			}
		}
		System.out.println(hm);

	}

	@Override
	public void deleteskill(int id1, String string1) {

		Set<Student> elSet = hm.keySet();
		List<String> l2 = new ArrayList<>();
		for (Student s1 : elSet) {
			if (s1.getSid() == id1) {
				l2 = hm.get(s1);
				l2.remove(string1);
				hm.put(s1, l2);
			}
		}
		System.out.println(hm);
	}

	@Override
	public void dispstud(String string2) {
		// TODO Auto-generated method stub
		List<Student> eList = new ArrayList<>();
		List<String> ll = new ArrayList<>();
		for (Student s : hm.keySet()) {
			ll = hm.get(s);
			for (String s1 : ll) {
				if (s1.equals(string2)) {
					eList.add(s);
				}
			}

		}
		System.out.println(eList);

	}

	@Override
	public List<Student> dispStudByDegree(String string3) {
		// TODO Auto-generated method stub
		List<Student> eList = new ArrayList<>();
		// List<String> ll = new ArrayList<>();
		for (Student s : hm.keySet()) {
			if (s.getDegree().equals(string3)) {
				eList.add(s);
			}

		}
		// System.out.println(eList);
		return eList;
	}

	// @Override
//	public void dispstud(String string2) {
//
//		Set<Student> elSet = hm.keySet();
//		List<String> l2 = new ArrayList<>();
//		Set<Student> elSet1;
//
//		for (Student s2 : elSet) {
//			l2 = hm.get(s2);
//
//			l2.equals(string2);
//			el.add(string2);
//			System.out.println(l2);
//		}
//	}

//	@Override
//	public Map<Student, String> dispbyskill(String string2) {
//
//		Set<Student> elSet = hm.keySet();
//		List<String> l2 = new ArrayList<>();
//		for (Student s2 : elSet) {
//			l2 = hm.get(s2);
//
//			l2.equals(string2);
//			return ;
//		}
//
//		return null;
//	}
}
