package com.demo.service;

import com.demo.beans.Student;

public interface StudentService {

	Student[] displayAll();

	void addNewStudent();

	Student searchbyid(int id);

	Student[] searchbyname(String nm);

	float calculategpa(int id);

}
