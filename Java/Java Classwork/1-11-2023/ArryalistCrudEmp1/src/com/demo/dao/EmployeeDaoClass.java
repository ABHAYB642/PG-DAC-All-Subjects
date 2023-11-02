package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Vendor;
import com.demo.comparators.MySalComparator;

public class EmployeeDaoClass implements EmployeeDaoIF{

	 static List<Employee> elist;
	 static {
		 elist=new ArrayList<Employee>();
		 elist.add(new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
	 		elist.add(new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
	 		elist.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
	 		elist.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
	    
	 }
	@Override
	public void save(Employee e) {
		elist.add(e);	
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return elist;
	}
	@Override
	public boolean deleteId(int id) {
//		int pos=elist.indexOf(new SalariedEmp(id)); //equals
//		elist.remove(pos);
		return elist.remove(new SalariedEmp(id));
	}
	@Override
	public Employee getbyID(int id) {
		int pos=elist.indexOf(new SalariedEmp(id)); //equals
		if(pos!=-1) {
			return elist.get(pos);
		}
		return null;
		
	}
	@Override
	public boolean updatesalbyID(int id, double sal) {
		Employee e = getbyID(id);
		if(e!=null)
		{
			if(e instanceof SalariedEmp) {
				((SalariedEmp)e).setSal(sal);
			}
			else if(e instanceof ContractEmployee)
			{
				((ContractEmployee)e).setCharges(sal);
			}
			else if(e instanceof Vendor)
			{
				((Vendor)e).setAmt(sal);
			}
			return true;
		}
		return false;
	}
	@Override
	public List<Employee> sortbyName() {
		List<Employee> elst=new ArrayList<>();
		for(Employee e:elist) {
			elst.add(e);
		}
		elst.sort(null);
		return elst;
	}
	@Override
	public List<Employee> sortbySal() {
		List<Employee> elst=new ArrayList<>();
		for(Employee e:elist) {
			elst.add(e);
		}
		//elst.sort(new MySalComparator());
		//use of lambda fun comparator hv only one abstrct method compare
		Comparator<Employee> mysal=(o1,o2)->{
			
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
		};
		elst.sort(mysal);

	return elst;
	}
	@Override
	public List<Employee> sortbydesg() {
		List<Employee> elst=new ArrayList<>();
		for(Employee e:elist) {
			elst.add(e);
		}
		//elst.sort(new MySalComparator());

		Comparator<Employee> mydesg=(o1,o2)->{
			return o1.getDesg().compareTo(o2.getDesg());
		};
		
		return elst;
	}
	@Override
	public Employee[] findTopNEmployeesBySal(int n) {
		List<Employee> elst=sortbySal();
		Employee[] arr=new Employee[n];
		for(int i=0;i<n;i++) {
			arr[i]=elst.get(i);
		}
		return arr;
	}
	
	
}
