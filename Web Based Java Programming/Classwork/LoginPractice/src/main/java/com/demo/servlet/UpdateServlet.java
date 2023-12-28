package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.ProductService;
import com.demo.service.ProductServiceInterface;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductServiceInterface o=new ProductService();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		boolean status=o.updatepass(uname,pass);
		RequestDispatcher rd;
		if(status) {
			rd=request.getRequestDispatcher("Login.html");
			out.println("Password Update Successfull");
			rd.include(request, response);	
		}
		else {
		rd=request.getRequestDispatcher("ForgetPassword.html");
		out.println("Invalid Username");
		rd.include(request, response);	
		}
	}

}
