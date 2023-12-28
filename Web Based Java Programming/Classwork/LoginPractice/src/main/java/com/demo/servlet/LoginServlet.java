package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.beans.User;
import com.demo.service.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
       
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		ProductServiceInterface o=new ProductService();
		User Myuser=o.validateUser(uname,pass);
		System.out.println(Myuser);
		if(Myuser!=null) {
			out.println("Success");
		}
		else {
			out.println("Not Success");
		}
			
		}

}
