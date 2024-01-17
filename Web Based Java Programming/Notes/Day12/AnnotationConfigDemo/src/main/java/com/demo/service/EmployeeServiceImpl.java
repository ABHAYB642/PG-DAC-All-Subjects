package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDaoImpl edao;

	public void addnewEmployee(){
		edao.save();
	}

}
