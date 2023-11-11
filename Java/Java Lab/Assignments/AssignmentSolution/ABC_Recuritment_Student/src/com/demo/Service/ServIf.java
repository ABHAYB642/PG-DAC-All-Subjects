package com.demo.Service;

import java.util.List;

import com.demo.Beans.Student;

public interface ServIf {

	void addStudent();

	void getid(int id, String string);

	void deleteId(int id);

	void deleteSkillById(int id1, String string1);

	void dispStudByskil(String string2);

	List<Student> dispStudByDegree(String string3);

}
