package com.xworkz.runner;

import com.xworkz.dto.MetroStaffDTO;
import com.xworkz.dto.MetroStaffRepositoryImp;
import com.xworkz.repo.MetroStaffRepository;

public class MetroStaffRunner {
	public static void main(String[] args) {
		MetroStaffDTO metroDto = new MetroStaffDTO("Hari",23,"M","Coimbatore","6201345681");
		MetroStaffDTO metroDto1 = new MetroStaffDTO("Ranjan",24,"M","Banglore","6201345688");
		System.out.println(metroDto.toString());
		
		MetroStaffRepository metro = new MetroStaffRepositoryImp();
		metro.save(metroDto);
		metro.save(metroDto1);
		
	}

}
