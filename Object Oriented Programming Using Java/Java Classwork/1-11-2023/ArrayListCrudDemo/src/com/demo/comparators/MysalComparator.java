package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.VendorEmp;

public class MysalComparator implements Comparator <Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		double sal1=0;
		double sal2=0;
		if(o1 instanceof SalariedEmp) {
			sal1=((SalariedEmp)o1).getSal();
		}
		else if(o1 instanceof ContractEmp) {
			sal1=((ContractEmp)o1).getCharges();
		}
		else if(o1 instanceof VendorEmp) {
			sal1=((VendorEmp)o1).getAmt();
		}
		
		
		if(o2 instanceof SalariedEmp) {
			sal2=((SalariedEmp)o2).getSal();
		}
		else if(o2 instanceof ContractEmp) {
			sal2=((ContractEmp)o2).getCharges();
		}
		else if(o2 instanceof VendorEmp) {
			sal2=((VendorEmp)o2).getAmt();
		}
		
		
		return (int)(sal1-sal2);
	}

}
