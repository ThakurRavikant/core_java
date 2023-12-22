package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) {
		


	String jdbcURL = "jdbc:mysql://localhost:3306/nov_3thjdbc";
	String username = "root";
	String password = "X-workZodc@123";

	String driverClass = "com.mysql.jdbc.Driver";
	
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query = "INSERT INTO Test(id,name,totalMark,subName) VALUE(1,'ram',100,'Math')";
		String query1 = "INSERT INTO Test(id,name,totalMark,subName) VALUE(2,'shyam',100,'Eng')";
		
		try {
			Connection con =DriverManager.getConnection(jdbcURL, username, password);
			PreparedStatement ptsmt =con.prepareStatement(query1);
			ptsmt.execute();
			System.out.println("Insert Data is Successfull....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
