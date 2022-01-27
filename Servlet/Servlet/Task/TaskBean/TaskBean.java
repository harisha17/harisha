package com.sonata.taskbean;

import java.sql.Date;

public class TaskBean {
	private String Name;
	private String Description;
	private int OwerId;
	private int CreaterId;
	private String Status;
	private String Priority;

	private String notes;
	private String isBookmarked;
	private Date createdOn;
	private Date modifiedOn;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getOwerId() {
		return OwerId;
	}
	public void setOwerId(int owerId) {
		OwerId = owerId;
	}
	public int getCreaterId() {
		return CreaterId;
	}
	public void setCreaterId(int createrId) {
		CreaterId = createrId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getIsBookmarked() {
		return isBookmarked;
	}
	public void setIsBookmarked(String isBookmarked) {
		this.isBookmarked = isBookmarked;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
}
