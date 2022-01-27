package com.springmvc.etg;

import java.sql.SQLException;

public interface UserInterface {
public boolean  validateuser(String name , String password) throws SQLException;

}
