package com.sonata.taskinterface;

import java.sql.SQLException;

import com.sonata.taskbean.TaskBean;

public interface TaskInterface {
public boolean addTask(TaskBean taskbean) throws SQLException,ClassNotFoundException;

}
