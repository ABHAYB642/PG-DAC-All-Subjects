package com.demo.dao;

import com.demo.beans.Student;

public interface StudentDao {

	Student[] getAll();

	void addNewstudent(Student s);

}
