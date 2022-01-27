package com.springmvc.etg.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement

public class Task {
	private int taskid;
	private String taskname;
	
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	
}
