package com.demo.dao;

import com.demo.beans.Student;

public interface StudentDao {

	Student[] getAll();

	void addNewstudent(Student s);

	Student searchbyid(int id);

	Student[] searchbyname(String nm);

	float calculategpa(int id);

}
