package com.demo.services;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;

public class EmpServicesImpl implements EmpServices {
	private EmpDao edao;

	public EmpServicesImpl() {
		edao = new EmpDaoImpl();
	}

	@Override
	public List<Employee> DisplayAll() {
		return edao.GetAll();
	}

	@Override
	public Employee GetById(int id2) {
		return edao.findbyId(id2);
	}

	@Override
	public Employee GetByName(String nm) {
		return edao.findbyNm(nm);
	}

	@Override
	public List<Employee> getbytype(int ch) {
		return edao.getbyType(ch);
	}

	@Override
	public List<Employee> getbyDesg(String s2) {
		return edao.getbyD(s2);
	}

	@Override
	public List<Employee> getbyDept(String s3) {
		return edao.getbyDept(s3);
	}

	@Override
	public boolean deletebyid(int id4) {
		return edao.delete(id4);
	}

	@Override
	public boolean modifySalById(int id5, double sal) {
		// TODO Auto-generated method stub
		return edao.ModifySal(id5, sal);
	}

	@Override
	public Set<Employee> SortBySal() {
		// TODO Auto-generated method stub
		return edao.SortSalary();
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		return edao.sortByName();
	}

}
