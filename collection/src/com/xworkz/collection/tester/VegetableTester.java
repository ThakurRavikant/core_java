package com.xworkz.collection.tester;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.collection.dto.VegetableDTO;

public class VegetableTester {
	public static void main(String[] args) {

		Collection<VegetableDTO> collection=new HashSet<VegetableDTO>();

		VegetableDTO dto1=new VegetableDTO("1","Tamoto",1,15);
		VegetableDTO dto2=new VegetableDTO("2","Cauliflower",1,25);
		VegetableDTO dto3=new VegetableDTO("3","Cabbage",1,30);
		VegetableDTO dto4=new VegetableDTO("4","Chlli",1,80);

		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);

		collection.forEach((dto)->{
			if(dto.getPrice()>=100) {
				System.out.println("The price is Good"+dto);
			}
		});



	}
}
