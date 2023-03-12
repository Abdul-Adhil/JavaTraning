package util;

import java.sql.Connection;

import java.sql.DriverManager;

public class ConnectionManager {

	public static void main(String[] args) throws Exception{
	
	//STEP1 - Load or Register the driver. - should be done only once in a application
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//STEP 2 - Establish a connection using the uid and password
	
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost/ace2023","root","root");
	
	System.out.println(con);
	
	}

}
