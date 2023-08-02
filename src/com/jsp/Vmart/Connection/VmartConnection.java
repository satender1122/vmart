package com.jsp.Vmart.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VmartConnection{
	public static Connection getProductConnection() {
		
	try {
		//step 1 : load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//step 2 connection create
		
		String url="jdbc:mysql://localhost:3306/jdbc-preparedStatement";
		String user="root";
		String pass="tiger";
		Connection connection=DriverManager.getConnection(url, user, pass);
		return connection;
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	return null;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	


}
