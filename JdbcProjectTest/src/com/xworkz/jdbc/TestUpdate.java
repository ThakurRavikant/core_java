package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate {
	
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
			
			String query = "Update test set name = ? where id=?";
			
			try {
			
				Connection conn = DriverManager.getConnection(jdbcURL, username, password);
				PreparedStatement ptmt= conn.prepareStatement(query);
				
				ptmt.setString(1, "Manoj");
				ptmt.setInt(2,1);
				ptmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
