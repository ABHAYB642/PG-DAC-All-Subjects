package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	public static Connection conn;
	public static PreparedStatement selemp,delemp,addemp,getbyid,updateemp;
	static {
		conn=DBUtil.getMyConnection(); 
		try {
			selemp=conn.prepareStatement("select * from employee");
		    delemp=conn.prepareStatement("delete from employee where empid=?");
		    addemp=conn.prepareStatement("insert into employee values(?,?,?)");
		    getbyid=conn.prepareStatement("select * from employee where empid=?");
		    updateemp=conn.prepareStatement("update employee set ename=?,sal=? where empid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Employee> getAllEmp() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			ResultSet rs=selemp.executeQuery();
			while(rs.next()) {
				Employee e = new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				list.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public boolean deleteEmp(int id) {
		
		int n=0;
		try {
			delemp.setInt(1,id);
			n = delemp.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(n>0) {
			return true;
		}
		return false;
	}
	@Override
	public void addemp(Employee e) {
	    int id=e.getEmpid();
	    String name=e.getEname();
	    double sal=e.getSal();
	  try {
		addemp.setInt(1, id);
		addemp.setString(2, name);
		addemp.setDouble(3, sal);
		addemp.executeUpdate();
		return;
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
	}
	@Override
	public Employee getById(int id) {
		Employee e=null;
		try {
			getbyid.setInt(1, id);
			ResultSet rs=getbyid.executeQuery();
			while(rs.next()) {
				e= new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				
			}
		} catch (SQLException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
		
		return e;
		
	}
	@Override
	public void updateemp(Employee e) {
		 int id=e.getEmpid();
		    String name=e.getEname();
		    double sal=e.getSal();
		    try {
		    	updateemp.setInt(3, id);
		    	updateemp.setString(1, name);
		    	updateemp.setDouble(2, sal);
		    	updateemp.executeUpdate();
				return;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	
}
