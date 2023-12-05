package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.SalariedEmp;
import com.demo.beans.VendorEmp;
import com.demo.dao.EmployeeDao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.demo.comparators.*;

public class EmployeeDao implements EmployeeDaoIF{
    static List<Employee> elist;
    static {
   	elist=new ArrayList<>();
   //	e=new SalariedEmp(id,name,mob,dept,ldt,desg,sal,bonus);
		elist.add(new SalariedEmp(12,"Rajat","4444","hr",LocalDate.of(2002, 12,30),"associate",5000,500));
		elist.add(new SalariedEmp(13,"Ajit","555","admin",LocalDate.of(2002, 10,30),"associate",4000,200));
		elist.add(new ContractEmp(14,"Rajas","666","admin",LocalDate.of(2002, 12,30),"manager",3000,12));
		elist.add(new ContractEmp(15,"Ashwini","434","hr",LocalDate.of(2000, 12,30),"associate",4500,10));
		elist.add(new VendorEmp(16,"Ashish","567","sales",LocalDate.of(2001, 12,29),"associate",10,6000));
		elist.add(new VendorEmp(17,"Rakesh","345","sales",LocalDate.of(2002, 10,30),"associate",8,8000));}
@Override
	public boolean save(Employee e) {
		elist.add(e);
		return true;
		
	}

		public List<Employee> getall() {
			List<Employee>elst=new ArrayList<>();
			for(Employee e:elist) {
				elst.add(e);
			}
			return elst;
		}
		 
	    public Employee getByid(int id) {
	    	int pos=elist.indexOf(new Person(id));
	    	if(pos!=-1) {
	    		return elist.get(pos);
	    	}
	    	return null;	
	    }

		@Override
		public boolean upsal(int id, double sal) {
			Employee e=getByid(id);
			if(e instanceof SalariedEmp) {
				((SalariedEmp)e).setSal(sal);
				return true;
			}
			else if(e instanceof ContractEmp) {
				((ContractEmp)e).setCharges(sal);
				return true;
			}
			else if(e instanceof VendorEmp) {
				((VendorEmp)e).setAmt(sal);
				return true;
			}
			return false;
		}

		@Override
		public boolean removebyid(int id) {
			Employee e=getByid(id);
			if(e!=null) {
			elist.remove(e);
			return true;
		}
			return false;
		}

		@Override
		public List<Employee> sortbyname() {
			List<Employee>elst=new ArrayList<>();
			for(Employee e:elist) {
				elst.add(e);
			}
			elst.sort(null);
			return elst;
		}

		@Override
		public List<Employee> sortbysal() {
			List<Employee>elst=new ArrayList<>();
			for(Employee e:elist) {
				elst.add(e);
			}
			elst.sort(new MysalComparator());
			return elst;
		}

		@Override
		public List<Employee> sortbydesg() {
			List<Employee>elst=new ArrayList<>();
			for(Employee e:elist) {
				elst.add(e);
			}
			Comparator<Employee>sortbydesg=(o1,o2)->{
				return  o1.getDesg().compareTo(o2.getDesg());
			};
			elst.sort(sortbydesg);
			return elst;
		}

		@Override
		public Employee[] findTopNemp(int n) {
			Employee [] etopn=new Employee[n];
			for(int i=0;i<n;i++) {
				etopn[i]=elist.get(i);
			}
			return etopn;	
		}
	    
}

