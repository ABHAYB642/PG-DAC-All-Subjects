package com.demo.servlet;

import java.io.IOException;

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
 * Servlet implementation class EditEmpServlet
 */
@WebServlet("/editemp")
public class EditEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService emps = new EmployeeServiceImpl();
		int id =Integer.parseInt(request.getParameter("eid"));
		System.out.println(id);
		Employee e = emps.getById(id);
		System.out.println(e);
		request.setAttribute("e", e);
		RequestDispatcher rd=request.getRequestDispatcher("editemp.jsp");
        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		double salary=Double.parseDouble(request.getParameter("sal"));
		Employee e=new Employee(id,name,salary);
		EmployeeService emps = new EmployeeServiceImpl();
		emps.updateemp(e);
		RequestDispatcher rd=request.getRequestDispatcher("displayemp");
        rd.forward(request, response);
	}

}
