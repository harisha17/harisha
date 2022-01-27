package com.tasksystem.dao;

import java.sql.SQLException;

import com.tasksystem.model.Task;

public interface TaskSystemDAO {
	public boolean addTask(Task task) throws SQLException;
}
