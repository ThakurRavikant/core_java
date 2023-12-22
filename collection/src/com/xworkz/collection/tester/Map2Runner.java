package com.xworkz.collection.tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.collection.dto.PassportDTO;
import com.xworkz.collection.dto.PassportType;
import com.xworkz.collection.dto.PersonDTO;

public class Map2Runner {
	public static void main(String[] args) {
		PersonDTO personDTO1 = new PersonDTO(1,"Ravikant","thakurravikant4040@gmail.com",6201279485l);
		PersonDTO personDTO2 = new PersonDTO(2,"Mukesh","mukeshsharma40@gmail.com",62012794855l);
		PersonDTO personDTO3 = new PersonDTO(3,"Naveen","naveenmd123@gmail.com",8201274585l);
		
		PassportDTO passportDTO1 = new PassportDTO(1, "Ajay", "07-08-2019", "Ravi", "07-08-2029", PassportType.DIPLOMATIC);
		PassportDTO passportDTO2 = new PassportDTO(1, "Sanjay", "07-08-2017", "Manjay", "07-08-2027", PassportType.OFFICAL);
		PassportDTO passportDTO3 = new PassportDTO(1, "Ravi", "07-08-2022", "Shashi", "07-08-2032", PassportType.DIPLOMATIC);
		
		Map<PersonDTO, PassportDTO> map = new HashMap<PersonDTO, PassportDTO>();
		map.put(personDTO1, passportDTO1);
		map.put(personDTO2, passportDTO2);
		map.put(personDTO3, passportDTO3);
		
		System.out.println("***Collecting all PersonDTO****");
		Set<PersonDTO> personDTO = map.keySet();
		personDTO.forEach(k -> System.out.println(k));
		
		System.out.println("***Collecting all PassportDTO****");
		Collection<PassportDTO> passportDTO = map.values();
		passportDTO.forEach(k -> System.out.println(k));
		
		System.out.println("***Collecting all Passport By Type****");

	}

}
