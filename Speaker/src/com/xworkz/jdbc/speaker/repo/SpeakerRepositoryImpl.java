package com.xworkz.jdbc.speaker.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.xworkz.jdbc.speaker.dto.SpeakerDTO;

public class SpeakerRepositoryImpl implements SpeakerRepository{

	SpeakerDTO speakerDto = new SpeakerDTO();


	@Override
	public boolean save(SpeakerDTO dto) {

		String jdbcURL = "jdbc:mysql://localhost:3306/oct_30thjdbc";
		String username = "root";
		String password = "X-workZodc@123";

		String driverClass = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Geeting connection to DateBase....");

		String insertQuery = "INSERT INTO speaker(id,brand_name,price,quality)VALUE (?,?,?,?)";

		try {
			Connection conn = DriverManager.getConnection(jdbcURL, username, password);
			PreparedStatement stm = conn.prepareStatement(insertQuery);
			stm.setInt(1, dto.getId());
			stm.setString(2, dto.getBrandName());
			stm.setInt(3, dto.getPrice());
			stm.setString(4, dto.getQuality());
			stm.execute();

			return true;




		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}


	@Override
	public boolean save(List<SpeakerDTO> speakerList) {
		
		String jdbcURL = "jdbc:mysql://localhost:3306/oct_30thjdbc";
		String username = "root";
		String password = "X-workZodc@123";

		String driverClass = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Geeting connection to DateBase....");

		String insertQuery = "INSERT INTO speaker(id,brand_name,price,quality)VALUE (?,?,?,?)";

		try {
			Connection conn = DriverManager.getConnection(jdbcURL, username, password);
			PreparedStatement stm = conn.prepareStatement(insertQuery);
			for (SpeakerDTO speakerDTO : speakerList) {
				stm.setInt(1, speakerDTO.getId());
				stm.setString(2, speakerDTO.getBrandName());
				stm.setInt(3, speakerDTO.getPrice());
				stm.setString(4, speakerDTO.getQuality());
				stm.execute();

			}
			return true;


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}




}
