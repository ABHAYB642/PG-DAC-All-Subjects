package com.demo.dao;

import java.util.Arrays;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {

	static Student[] sarr;
	static int cnt;
	static {
		sarr=new Student[10];
		cnt=0;
		
		//sarr[0]=new Student(1,"Jay",3,{20,20,20});
		sarr[0] = new Student(1, "Jay", 3, new int[]{20,20,20});
		cnt=1;
	}
	@Override
	public Student[] getAll() {
         return sarr;
      //System.out.println(sarr);
//		for (int i = 0; i < sarr.length; i++) {
//		    //Student student = sarr[i];
//		    System.out.println(sarr[i].getSid() + " " + sarr[i].getSname() + " "+sarr[i].getGpa()+" " + Arrays.toString(sarr[i].getMarks()));
//		}
	}
	@Override
	public void addNewstudent(Student s) {
		sarr[cnt]=s;
		cnt++;	
	}

}
