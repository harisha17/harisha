package com.sonata.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.taskbean.TaskBean;
import com.sonata.taskimpl.TaskServletImpl;

/**
 * Servlet implementation class TaskServlet
 */
@WebServlet("/task")
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		PrintWriter out=response.getWriter();
		boolean flag = false;

		TaskBean t= new TaskBean();
		t.setName(request.getParameter("taskname"));
		t.setDescription(request.getParameter("description"));
		t.setStatus(request.getParameter("status"));
		t.setPriority(request.getParameter("prioty"));
		t.setIsBookmarked(request.getParameter("IsBookMarkes"));
		t.setOwerId(Integer.parseInt(request.getParameter("OwerId")));
		try
		{
		flag = new TaskServletImpl().addTask(t);

		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		if (flag) out.println("Sucess");

		else out.println("Not able to insert the task");





		}





		}
		
		

