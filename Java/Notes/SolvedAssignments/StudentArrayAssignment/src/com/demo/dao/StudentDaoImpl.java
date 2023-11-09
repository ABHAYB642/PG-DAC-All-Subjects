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
		sarr[0] = new Student(1, "Jay", 3, new int[]{20,40,20});
		sarr[1] = new Student(2, "Ram", 3, new int[]{20,20,20});
		sarr[2] = new Student(3, "Jay", 3, new int[]{20,20,20});
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
	public int getposbyid(int id)
	{
		for(int i=0;i<cnt;i++)
		{
			if(sarr[i].getSid()==id)
				return i;
			break;
		}
		return -1;
	}
	@Override
	public Student searchbyid(int id) {
		int pos=getposbyid(id);
		if(pos!=-1)
		{
			return sarr[pos];
		}
		
		return null;
		
	}
	@Override
	public Student[] searchbyname(String nm) {
	   Student[] name=new Student[10];
	   int count=0;
	   for(Student s:sarr)
	   {
		   if(s!=null) {
		   if(s.getSname().equals(nm))
		   {
			   name[count]=s;
			   count++;
		   }
		   
	   }}
	   if(name!=null)
	   {
		   return name;
	   }
	   return null;
	}
	@Override
	public float calculategpa(int id) {
		Student s=searchbyid(id);
		int [] marks=new int[3];
		marks=s.getMarks();
		int m1=marks[0];
		int m2=marks[1];
		int m3=marks[2];
//		for(int i=0;i<3;i++) {
//		System.out.println(marks[i]);
//		}
		//float gpa=((1/3)*m1)+((1/2)*m2)+((1/4)*m3);
		float gpa=m1+m2+m3;
		return gpa;
	}

}
