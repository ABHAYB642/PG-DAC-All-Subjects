package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Vendor;

public class MySalComparator implements Comparator <Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		double sal1 = 0,sal2=0;
		if(o1 instanceof SalariedEmp) {
			sal1=((SalariedEmp)o1).getSal();
			
		}
		else if(o1 instanceof ContractEmployee) {
			sal1=((ContractEmployee)o1).getCharges();
		}
		else {
			sal1=((Vendor)o1).getAmt();
		}
		if(o2 instanceof SalariedEmp) {
			sal2=((SalariedEmp)o2).getSal();
			
		}
		else if(o2 instanceof ContractEmployee) {
			sal2=((ContractEmployee)o2).getCharges();
		}
		else {
			sal2=((Vendor)o1).getAmt();
		}
		return (int)(sal1-sal2);
	}

}
