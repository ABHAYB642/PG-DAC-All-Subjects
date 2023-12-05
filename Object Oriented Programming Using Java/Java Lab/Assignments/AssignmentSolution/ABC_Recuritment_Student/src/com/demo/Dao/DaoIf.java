package com.demo.Dao;

import java.util.List;

import com.demo.Beans.Student;

public interface DaoIf {

	void save(Student s, List<String> sk);

	void addSkill(int id, String string);

	void removeID(int id);

	void deleteskill(int id1, String string1);

	void dispstud(String string2);

	List<Student> dispStudByDegree(String string3);

}
