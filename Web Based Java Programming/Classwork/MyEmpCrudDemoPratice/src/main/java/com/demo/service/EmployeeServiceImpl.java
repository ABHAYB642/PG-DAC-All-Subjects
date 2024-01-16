package com.demo.service;
import java.util.List;
import com.demo.dao.*;
import com.demo.model.Employee;


public class EmployeeServiceImpl implements EmployeeService {

	public static EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao = new EmployeeDaoImpl();
	}
	@Override
	public List<Employee> getAllEmp() {
		return edao.getAllEmp();
	}
	@Override
	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		return edao.deleteEmp(id);
	}
	@Override
	public void addemp(Employee e) {
		edao.addemp(e);
		
	}
	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return edao.getById(id);
	}
	@Override
	public void updateemp(Employee e) {
		 edao.updateemp(e);
		
	}

}
