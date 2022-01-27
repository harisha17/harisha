package com.example.springdemo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;

import com.example.springdemo.LoginInterface;
import com.example.springdemo.MySQLConnection;

@Component
public class LoginImpl implements LoginInterface {
@Autowired
MySQLConnection mySQLConnectionImpl;
public boolean validateUser(User username, User password) throws SQLException {
		boolean st =false;
      
           Connection con = mySQLConnectionImpl.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("select password from login ");
      
            ResultSet rs =(ResultSet) ps.executeQuery();
            User str =  password;
            System.out.println(str);
            while(rs.next())
            {
            	String compareTo = rs.getString("password");
            	if(str.equals(compareTo)) {
            		System.out.println("valid user");
            	}
            	else {
            		System.out.println("Not a vaild user");
            	}
            }
            return st = true;
            //st = rs.next();
//            if( rs.getString("password").equals(password))
//    			    {
//    			    return true;
//    			    }else
//    			    {
//    			    return false;
//    			    }
//    		
//            
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }
//        return st;  
		/*MySQLConnection con  =  new  MySQLConnectionImpl();
		java.sql.Connection c = con.getConnection();
		String sql = "SELECT * FROM userdetails";
		PreparedStatement st = (PreparedStatement) c.prepareStatement(sql);
		if(username.equals(username) && pwd.equals(password)
			    {
			    return true;
			    }else
			    {
			    return false;
			    }
		return true;
		boolean  loginSuccessful = false;
		 String sql = "SELECT* FROM  Login WHERE Username=@userName AND [Password]=@password'";

		 MySQLConnection con  =  new  MySQLConnectionImpl();
		con.Parameters.Add(new SqlParameter("Name", userName));
		con.Parameters.Add(new SqlParameter("[Password]", password));
		SQLDataReader rdr = mySQL.ExecuteReader();

		if (rdr.HasrRows()) 
		   loginSuccessful = true;

		return loginSuccessful ;*/
	}
	public boolean validateUser(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean validateUser(com.example.springdemo.model.User username, com.example.springdemo.model.User password)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
