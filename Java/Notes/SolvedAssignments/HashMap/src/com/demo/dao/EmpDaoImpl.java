package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.VendorEmp;

public class EmpDaoImpl implements EmpDao {
	static Map<Integer,Employee>hm;
	static {
		hm=new HashMap<>();
		hm.put(1,new SalariedEmp(1,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
		hm.put(2, new SalariedEmp(2,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
		hm.put(3, new ContractEmp(3,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
		hm.put(4, new ContractEmp(4,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
		hm.put(5,new VendorEmp(5,"Ash","857","ash@gmail.com","hr","associate",LocalDate.of(2001, 02,26),10,1000.0));
		hm.put(6,new VendorEmp(6,"Mayur","227","mp@gmail.com","admin","manager",LocalDate.of(2001, 02,10),20,5000.0));
	}
	@Override
	public void save(Employee e) {
		if(!hm.containsKey(e.getPid())) {
		hm.put(e.getPid(),e);
		}
	}
	@Override
	public Boolean deleteid(int id) {
		
		return null;
	}
	@Override
	public Employee displaybyid(int id) {
		return hm.get(id);
		//System.out.println(hm.get(id));
		
	}
	@Override
	public Collection<Employee> getAll() {
		return hm.values();
		// elst;
	}
	@Override
	public Boolean updateSalById(int id, double sal) {
		Employee ob=hm.get(id);
		if(ob!=null) {
			if(ob instanceof SalariedEmp) {
				((SalariedEmp) ob).setSal(sal);
			}
			else if(ob instanceof ContractEmp) {
				((ContractEmp)ob).setCharges(sal);
			}
			else if(ob instanceof VendorEmp) {
				((VendorEmp)ob).setAmt(sal);
			}
			return true;
		}
		return false;
	}

	@Override
	public Employee[] TopNEmployee(int n) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> findBySalary(double sal) {
		List<Employee> elist=(List<Employee>)hm.values();
		List<Employee> select = new ArrayList<>();
		for(Employee e:elist) {
			if(e instanceof SalariedEmp) {
				if(((SalariedEmp)e).getSal()>sal) {
					select.add(e);
				}
			} else if(e instanceof ContractEmp) {
				if(((ContractEmp)e).getCharges()>sal) {
					select.add(e);
				}
			} else if(e instanceof VendorEmp) {
				if(((VendorEmp)e).getAmt()>sal) {
					select.add(e);
				}
			} else {
				System.out.println("Not Found");
			}
		}
		if(select.size()>0) {
		return select;
		}
		return null;
	}
	
	
}
