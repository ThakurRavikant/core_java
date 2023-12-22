package com.xworkz.jdbcExecuiton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcExecution {
	public static void main(String[] args) {


		String jdbcURL = "jdbc:mysql://localhost:3306/oct_30thjdbc";
		String userName = "root";
		String password = "X-workZodc@123";

		String driverclass = "com.mysql.jdbc.Driver"; // FQCN

		try {
			//Class loading/ class loader
			//load and register driver class
			Class.forName(driverclass);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String query = "INSERT into bank(id, name, branch, state) VALUES(2, 'HDFC', 'HSR', 'Karnataka')";
		String updateQuery = "UPDATE bank set branch='BTM_layout' where name = 'SBI'";
//		String deleteQuery = "delete from bank where name = 'SBI'";
		System.out.println("Getting connection to database");
		try {		
			// set connection to Database server
			Connection conn = DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Getting connection to database sucessfully !!!!");
			Statement stmt	=  conn.createStatement();
			stmt.execute(query);
			System.out.println("Execute insert query");
			
			stmt.execute(updateQuery);
			System.out.println("Execute insert query");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
