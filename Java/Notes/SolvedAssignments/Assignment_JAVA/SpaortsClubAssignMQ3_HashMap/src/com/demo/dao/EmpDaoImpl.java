package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.SalEmp;
import com.demo.beans.Vendor;

public class EmpDaoImpl implements EmpDao {

	static Map<Integer, Employee> hm;
	static {
		hm = new HashMap<>();
		hm.put(1, new SalEmp(1, "harsh", "123", "1@email.com", "hr", "HeadHr", LocalDate.of(2001, 05, 06), 888, 800));
		hm.put(2,
				new ContractEmp(2, "Venky", "123", "2@email.com", "IT", "Manager", LocalDate.of(2001, 05, 06), 8, 700));
		hm.put(3, new Vendor(3, "Shubham", "456", "3@email.com", "hr", "HeadHr", LocalDate.of(2002, 05, 07), 10, 5656));
	}

	@Override
	public List<Employee> GetAll() {
		List<Employee> list = new ArrayList<>(hm.values());
		return list;

	}

	@Override
	public Employee findbyId(int id2) {
		return hm.get(id2);
	}

	@Override
	public Employee findbyNm(String nm) {

		for (Employee e : hm.values()) {
			if (e.getName().equals(nm)) {
				return e;
			}
		}
		return null;
	}

	@Override
	public List<Employee> getbyType(int ch) {
		List<Employee> list = new ArrayList<>();
		for (Employee e : hm.values()) {
			if (e != null) {
				if (ch == 1 && e instanceof SalEmp) {
					list.add(e);

				} else if (ch == 2 && e instanceof ContractEmp) {
					list.add(e);
				} else if (ch == 3 && e instanceof Vendor) {
					list.add(e);
				}
			} else {
				return null;
			}
		}

		return list;
	}

	@Override
	public List<Employee> getbyD(String s2) {
		List<Employee> l3 = new ArrayList<>();
		for (Employee e : hm.values()) {
			if (e.getDesg().equals(s2)) {
				l3.add(e);
			}
		}
		return l3;
	}

	@Override
	public List<Employee> getbyDept(String s3) {
		List<Employee> l4 = new ArrayList<>();
		for (Employee e : hm.values()) {
			if (e.getDept().equals(s3)) {
				l4.add(e);
			}
		}
		return l4;
	}

	@Override
	public boolean delete(int id4) {
		Employee e = hm.remove(id4);
		if (e != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean ModifySal(int id5, double sal) {
		// TODO Auto-generated method stub
		Employee e = findbyId(id5);
		if (e != null) {
			if (e instanceof SalEmp) {
				((SalEmp) e).setBasic_sal(sal);
			} else if (e instanceof ContractEmp) {
				((ContractEmp) e).setCharges(sal);
			} else {
				((Vendor) e).setAmount(sal);
			}
			return true;
		}
		return false;
	}

	@Override
	public Set<Employee> SortSalary() {
		// TODO Auto-generated method stub
		Comparator<Employee> mysal = (o1, o2) -> {
			double sal1 = 0, sal2 = 0;
			if (o1 instanceof SalEmp) {
				sal1 = ((SalEmp) o1).getBasic_sal();
			} else if (o1 instanceof ContractEmp) {
				((ContractEmp) o1).getCharges();
			} else {
				sal1 = ((Vendor) o1).getAmount();
			}
			if (o2 instanceof SalEmp) {
				sal2 = ((SalEmp) o2).getBasic_sal();
			} else if (o2 instanceof ContractEmp) {
				sal2 = ((ContractEmp) o2).getCharges();
			} else {
				sal2 = ((Vendor) o2).getAmount();
			}
			return (int) (sal1 - sal2);
		};
		TreeSet<Employee> ts = new TreeSet<Employee>(mysal);
		for (Employee e : hm.values()) {
			ts.add(e);
		}
		return ts;
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		Comparator<Employee> name = (o1, o2) -> {
			String n1, n2;
			if (o1 instanceof Person) {
				n1 = o1.getName();
			}
			if (o2 instanceof Person) {
				n2 = o2.getName();
			}
			return n1.compareTo(n2);
		};
		List<Employee> rr = new ArrayList<>();
		for (Employee e : hm.values()) {
			rr.add(e);
		}
		rr.sort(null);
		return rr;
	}

	// @Override

	/*
	 * public Set<Employee> sortByName() { // TODO Auto-generated method stub
	 * TreeSet<Employee> tr = new TreeSet<>(); for (Employee e : hm.values()) {
	 * tr.add(e); } return tr; }
	 */
	/*
	 * public Set<Employee> sortByName() { TreeSet<Employee> h1 = new TreeSet<>();
	 * for (Employee e : hm.values()) { h1.add(e); }
	 * 
	 * return h1; }
	 */

}
