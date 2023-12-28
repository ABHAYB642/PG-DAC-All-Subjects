package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.User;
import com.demo.dao.*;
public class ProductDao implements ProductDaoInterface{

	static Connection conn;
	static PreparedStatement finduser; 
	static PreparedStatement updatepass;
	static {
		conn=DBUtil.getMyConnection();
		try {
			finduser=conn.prepareStatement("Select * from user where uname=? and password=?");
			updatepass=conn.prepareStatement("UPDATE user SET password=? where uname=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public User validateuser(String uname, String pass) {
		try {
		    finduser.setString(1,uname);
		    finduser.setString(2,pass);
			ResultSet rs=finduser.executeQuery();
			if(rs.next()) {
			User myuser=new User(rs.getString(1),rs.getString(2),rs.getString(3));
			return myuser;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean updatepass(String uname, String pass) {
		try {
			updatepass.setString(1,pass);
			updatepass.setString(2,uname);
			int n=updatepass.executeUpdate();
			if(n>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
}
