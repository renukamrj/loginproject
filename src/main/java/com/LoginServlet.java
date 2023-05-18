package com;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	    String email=request.getParameter("email");
		
		String password=request.getParameter("pswd");
		
		if("surendra@gmail.com".equals(email) && "test".equals(password) ) {
			
			 HttpSession session =request.getSession();
			 session.setAttribute("email", email);
			 
			 
			 ServletContext sc=getServletContext();//it will give application scope object
			 sc.setAttribute("company", "www.mycompany.com");
			
			request.getRequestDispatcher("congrates.jsp").forward(request, response);		
			
			
		}
		
		else {
			 request.setAttribute("msg", "plz try again..something wrong");
			 
			 HttpSession session =request.getSession();
			 session.setAttribute("email", email);
			 
			 
			 ServletContext sc=getServletContext();//it will give application scope object
			 sc.setAttribute("company", "www.mycompany.com");
			 
			 
			 
			
			request.getRequestDispatcher("login.jsp").forward(request, response);	
			
		}
		
		
		
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}


