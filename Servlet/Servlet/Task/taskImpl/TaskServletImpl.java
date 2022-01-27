package com.sonata.taskimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.taskbean.TaskBean;
import com.sonata.taskinterface.TaskInterface;

public class TaskServletImpl implements TaskInterface{

	public boolean addTask(TaskBean taskbean) throws SQLException, ClassNotFoundException {
		boolean flag = false;
		MySQLConnectionimpl con = new MySQLConnectionimpl();
		Connection c = con.getConnection();
		String sql = "insert into task(taskname,description) values(?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, taskbean.getName());
		st.setString(2, taskbean.getDescription());
		int r = st.executeUpdate();
		if (r >0)
		return true;
		else
		return false; }}


