package com.tasksystem;

import java.sql.Connection;
import java.sql.SQLException;

import com.tasksystem.dao.MySQLConnection;
import com.tasksystem.dao.impl.MySQLConnectionImpl;
import com.tasksystem.dao.impl.TaskSystemDAOImpl;
import com.tasksystem.model.Task;

public class TestMyTaskSystem {

	public static void main(String[] args) {
		//MySQLConnection con = new MySQLConnectionImpl();
		//Connection c = con.getConnection();
		//System.out.println(c);
		Task t =  new Task();
		t.setTaskId(1000);
		t.setName("Create a DAO");
		t.setOwnerId(5000);
		t.setDescription("Create a class for Task");
		try {
			new TaskSystemDAOImpl().addTask(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
	}

}
