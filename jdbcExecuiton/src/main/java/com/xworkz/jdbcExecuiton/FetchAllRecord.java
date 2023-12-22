package com.xworkz.jdbcExecuiton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class FetchAllRecord {
	public static void main(String[] args) {

		fetchAll();
		fetchSingle();
	}

	private static void fetchAll() {
		String jdbcUrl = "jdbc:mysql://localhost:3306/BANK";
		String userName = "root";
		String password = "X-workZodc@123";

		String driverClass="com.mysql.jdbc.Driver";
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			System.out.println("Loading Driver Class");
			e.printStackTrace();
		}

		String fetchByBankName = "Select * from INFO where B_NAME = 'HDFC'";
		System.out.println("Establishing connection to database");
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(jdbcUrl, userName, password);
			System.out.println("Connection to database is successfull...!!");
			PreparedStatement stmt = conn.prepareStatement(fetchByBankName);
			ResultSet rs = stmt.executeQuery();
			System.out.println(rs);
			while(rs.next()) {
				System.out.println("Fetching all bank info....!!!!!");
				System.out.println("Bank Name: "+rs.getString(2));
				System.out.println("Branch Name: "+rs.getString(3));
				System.out.println("State: "+rs.getString(4));
			}
			System.out.println("Executed select query");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {			
				try {
					conn.close();
					System.out.println("Connection is closed");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


	private static void fetchSingle() {
		System.out.println("  ");
		System.out.println("Fetching Single Bank info.....!!!!!!");
		String jdbcUrl = "jdbc:mysql://localhost:3306/BANK";
		String userName = "root";
		String password = "X-workZodc@123";

		String driverClass="com.mysql.jdbc.Driver";
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			System.out.println("Loading Driver Class");
			e.printStackTrace();
		}

		String fetchByBankName = "Select * from INFO where B_NAME = 'HDFC'";
		System.out.println("Establishing connection to database...");
//		Connection conn = null;
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			System.out.println("Connection to database is successfull...!!");
			PreparedStatement stmt = conn.prepareStatement(fetchByBankName);
			ResultSet rs = stmt.executeQuery();
			System.out.println(rs);
			if(rs.next()) {
				System.out.println("Bank Name: "+rs.getString(2));
				System.out.println("Branch Name: "+rs.getString(3));
				System.out.println("State: "+rs.getString(4));
			}
			System.out.println("Executed select query");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//		finally {
		//			if(conn!=null) {
		//				
		//			
		//			try {
		//				conn.close();
		//			} catch (SQLException e) {
		//				// TODO Auto-generated catch block
		//				e.printStackTrace();
		//			}
		//		}
		//	}
	}

}