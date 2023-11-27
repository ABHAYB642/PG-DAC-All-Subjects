package com.demo.test;

import com.demo.beans.Employee;
import com.demo.beans.EmployeeLinkedList;

public class TestEmpLL {

	public static void main(String[] args) {
		EmployeeLinkedList ob=new EmployeeLinkedList();
		
		Employee e1 = new Employee(2,"ram",34455);
		Employee e2 = new Employee(1,"rajesh",4567);
		Employee e3 = new Employee(3,"rameash",3343);
		Employee e4 = new Employee(5,"raju",5345);
		Employee e5 = new Employee(6,"ramu",2555);
		Employee e6 = new Employee(4,"kaka",5532);
		ob.addNewEmpAtEnd(e1);
		ob.addNewEmpAtEnd(e2);
		ob.addNewEmpAtEnd(e3);
		ob.addNewEmpAtEnd(e4);
		ob.addNewEmpAtEnd(e5);
		ob.addNewEmpAtEnd(e6);
		//ob.searchByID(45);
		ob.deletebyID(6);
		ob.deletebyID(4);
		ob.displaydata();

	}

}
