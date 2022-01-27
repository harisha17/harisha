package com.tasksystem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tasksystem.dao.MySQLConnection;
import com.tasksystem.dao.TaskSystemDAO;
import com.tasksystem.model.Task;

public class TaskSystemDAOImpl implements TaskSystemDAO {

	@Override
	public boolean addTask(Task task) throws SQLException {
		boolean flag = false;
		MySQLConnection con  =  new  MySQLConnectionImpl();
		Connection c = con.getConnection();
		String sql = "insert into Task (taskid,name, ownerid,description) values(?,?,?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setInt(1, task.getTaskId());
		st.setString(2, task.getName());
		st.setInt(3, task.getOwnerId());
		st.setString(4, task.getDescription());
		int r = st.executeUpdate();
		return true;
		
	}

}
