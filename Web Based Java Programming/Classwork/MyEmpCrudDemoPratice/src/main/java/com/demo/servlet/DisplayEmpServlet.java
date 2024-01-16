package com.demo.servlet;
import com.demo.model.Employee;
import com.demo.service.*;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayEmpServlet
 */
@WebServlet("/displayemp")
public class DisplayEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService emps = new EmployeeServiceImpl();
	    	List<Employee> glist=emps.getAllEmp();
	    	request.setAttribute("glist", glist);
	    	RequestDispatcher rd=request.getRequestDispatcher("displayall.jsp");				
	    	rd.forward(request, response);
	
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
