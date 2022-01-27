package com.springmvc.etg;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringmvcApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(SpringmvcApplication.class, args);

		//ApplicationContext ctx = SpringApplication.run(SpringmvcApplication.class, args);
		//UserInterface user =(UserInterface)ctx.getBean("userImpl");
		//boolean flag = false;
		//flag=user.validateuser("Junisa", "pwd");
		//System.out.println(flag);
		//if(flag==true) {
		//System.out.println("Successufly logged in !");
		//}
		//else {
		//System.out.println("incorrect credentials, please check username and password !");
		//}
		//}


	}
}

