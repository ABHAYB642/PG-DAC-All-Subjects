package com.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

/**
 * Servlet implementation class DeleteEmp
 */
@WebServlet("/deleteemp")
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService emps = new EmployeeServiceImpl();
		int id =Integer.parseInt(request.getParameter("eid"));
		System.out.println(id);
		System.out.println("abhay");
    	boolean status=emps.deleteEmp(id);
    	System.out.println(status);
    	RequestDispatcher rd=request.getRequestDispatcher("displayemp");
        rd.forward(request, response);
        
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
