package com.springmvc.etg.task;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.etg.model.Task;
import com.springmvc.etg.model.TaskBean;
import com.springmvc.etg.model.UserBean;

@Component
public class TaskImpl implements TaskInterface {
	@Autowired
	MySQLConnection  mySQLConnectionIm;
	public boolean addTask(TaskBean task) throws SQLException {
		
		boolean flag = false;
		//MySQLConnection con  =  new  MySQLConnectionIm();
		Connection c =  mySQLConnectionIm.getConnection();
		String sql = "insert into task (taskid,creatorid,taskname,description,status,priority,notes,bookmark,ownerid,creatoron,modifiedon) values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setInt(1, task.getTaskId());
		st.setInt(2,task.getCreatorId());
		st.setString(3, task.getTaskname());
		st.setString(4, task.getDescription());
		st.setString(5, task.getStatus());
		st.setString(6, task.getPriority());
		st.setString(7, task.getNotes());
		st.setString(8, task.getBookmark());
		st.setInt(9, task.getOwnerId());
		st.setDate(10, (Date)task.getCreatorOn());
		st.setDate(11,(Date)task.getModifiedOn());
		int r = st.executeUpdate();
		c.close();
		if(r<0) {
			System.out.println(r);
			return true;
			}
			else {
			return false;
			}
	}
@Override
public TaskBean getTask(int taskid) {
Connection c = mySQLConnectionIm.getConnection();
TaskBean task =new TaskBean();
try {
String sql ="select * from task where taskid=?";
PreparedStatement st = c.prepareStatement(sql);
st.setInt(1,taskid);
ResultSet rs= st.executeQuery();
while (rs.next())
{
task.setTaskId(rs.getInt("taskid"));
task.setCreatorId(rs.getInt("creatorid"));
task.setTaskname(rs.getString("taskname"));
task.setDescription(rs.getString("description"));
task.setStatus(rs.getString("status"));
task.setPriority(rs.getString("priority"));
task.setNotes(rs.getString("notes"));
task.setBookmark(rs.getString("notes"));
task.setOwnerId(rs.getInt("ownerid"));
}
c.close();
}catch(Exception e) {
e.printStackTrace();
}

return task;

}

public int assignOwner(int taskid,int ownerid) {
Connection c = mySQLConnectionIm.getConnection();
int rows=0;
try {
String sql = "update task set ownerid=? where taskid=?";
PreparedStatement st = c.prepareStatement(sql);
st.setInt(2, taskid);
st.setInt(1,ownerid);
rows=st.executeUpdate();
c.close();
} catch(Exception e) {
e.printStackTrace();
}
return rows;
}

public TaskBean getTask(String Status) {
Connection c = mySQLConnectionIm.getConnection();
TaskBean task =new TaskBean();
try {
String sql ="select * from task where Status=?";
PreparedStatement st = c.prepareStatement(sql);
st.setString(1,Status);
ResultSet rs= st.executeQuery();
while (rs.next())
{
task.setTaskId(rs.getInt("taskid"));
task.setCreatorId(rs.getInt("creatorid"));
task.setTaskname(rs.getString("taskname"));
task.setDescription(rs.getString("description"));
task.setStatus(rs.getString("status"));
task.setPriority(rs.getString("priority"));
task.setNotes(rs.getString("notes"));
task.setBookmark(rs.getString("notes"));
task.setOwnerId(rs.getInt("ownerid"));
}
c.close();
}catch(Exception e) {
e.printStackTrace();
}

return task;

}

public int assignpriority(int taskid,int priority)
{
Connection c = mySQLConnectionIm.getConnection();
int rows=0;
try
{
String sql ="update task set priority =? where taskid=?";
PreparedStatement st = c.prepareStatement(sql);
st.setInt(2,taskid);
st.setInt(1,priority);
rows= st.executeUpdate();
c.close();
}
catch(SQLException e)
{
System.out.println(e.getMessage());
}
return rows;
}

public int setNote(int taskid,String notes)
{
Connection c = mySQLConnectionIm.getConnection();
int rows=0;
try
{
String sql ="update task set notes =? where taskid=?";
PreparedStatement st = c.prepareStatement(sql);
st.setInt(2,taskid);
st.setString(1,notes);
rows= st.executeUpdate();
c.close();
}
catch(SQLException e)
{
System.out.println(e.getMessage());
}
return rows;
}


public boolean addUser(UserBean user) throws SQLException {
	boolean flag = false;
	//MySQLConnection con  =  new  MySQLConnectionIm();
	Connection c =  mySQLConnectionIm.getConnection();
	String sql = "insert into user(uid,name, password) values(?,?,?)";
	PreparedStatement st = c.prepareStatement(sql);
	st.setInt(1,user.getUid());
	st.setString(2, user.getName());
	st.setString(3, user.getPassword());
	
	int r = st.executeUpdate();
	c.close();
	if(r<0) {
	System.out.println(r);
	return true;
	}
	else {
	return false;
	}
}

@Override
public List<TaskBean> getallTask(int ownerid) {
	Connection con = mySQLConnectionIm.getConnection();
	List<TaskBean> tasklist= new ArrayList<TaskBean>();
	try {
		String sql = "select * from task where ownerid=? ";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, ownerid);

		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			TaskBean  task= new TaskBean();
			task.setTaskId(rs.getInt("taskid"));
			task.setCreatorId(rs.getInt("creatorid"));
			task.setTaskname(rs.getString("taskname"));
            task.setDescription(rs.getString("description"));
            task.setStatus(rs.getString("status"));
            task.setPriority(rs.getString("priority"));
            task.setNotes(rs.getString("notes"));
			task.setBookmark(rs.getString("bookmark"));
			task.setOwnerId(rs.getInt("ownerid"));
			task.setCreatorOn((Date)rs.getDate("creatoron"));
			task.setModifiedOn((Date)rs.getDate("modifiedon"));
			tasklist.add(task);
		}
		con.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	return tasklist;
}


	
}
