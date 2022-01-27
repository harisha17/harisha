package com.example.springdemo;

import java.sql.SQLException;

import com.example.springdemo.model.User;

public interface LoginInterface {
	public boolean  validateUser(User junisha, User pwd) throws SQLException;
	

}
