package com.etg.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String classname=request.getParameter("cname");
		out.println(firstname+"<br>");
		out.println(lastname+"<br>");
		out.println(classname+"<br>");
		out.println(new java.util.Date());
		out.println(response.getStatus());
		response.sendError(407, "Need authentication!!!" );
		response.setStatus(500);
		out.println(response.getLocale());
		
		
	}
		public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
				 doGet(request, response);
				 }

		
/*
		String firstname=request.getParameter("fname");
		
		out.println("<h> Hello everyone this is my first servlet</h><br>");
		out.println("<h> Hello Junisha</h><br>");
		out.println(firstname+"<br>");
		out.println("<h> Hello Junisha</h>");*/
		
	}
