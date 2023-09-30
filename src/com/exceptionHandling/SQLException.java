package com.exceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLException {

	public static void main(String[] args) {
		
		String url = 	"jdbc:mysql://localhost:3306/demo";
		String username = "root";
		String password = "pratapraje";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet resultSet = null;
		
		try {
			// load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			// Establish a database connection
			con = DriverManager.getConnection(url, username, password);
			
			// create a sql Statement
			stmt = con.createStatement();
			
			// Execute a sql query that will result in a SQL exception
			resultSet = stmt.executeQuery("SELECT * FROM employee");
			
			// process the query result  // this won't be reached in cas of exception occure
			while (resultSet.next()) {
				// process the data from the resultset
				//............
			}
		    }catch(Exception e) {
		    	// handle the sql exception
			System.out.println("SQL Exception Occured :" + e.getMessage());
			e.printStackTrace();
			
		}finally {
			
			//close the connection here
			try {
				if(con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			}catch(Exception e) {
				System.out.println("Error Occured while closing connections : " + e.getMessage() );
			}
		}
	}

}
