package com.springmvc.etg.model;

import java.util.Date;

public class TaskBean {
	private int taskId;
	private int creatorId;
	private String taskname;
	private String description;
	private String status;
	private String priority;
	private String notes;
	private String Bookmark;
	private int ownerId;
	private Date creatorOn;
	private Date modifiedOn;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(int creatorid) {
		this.creatorId = creatorid;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getBookmark() {
		return Bookmark;
	}
	public void setBookmark(String bookmark) {
		Bookmark = bookmark;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public Date getCreatorOn() {
		return creatorOn;
	}
	public void setCreatorOn(Date creatorOn) {
		this.creatorOn = creatorOn;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
}
	