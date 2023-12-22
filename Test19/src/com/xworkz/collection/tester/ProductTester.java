package com.xworkz.collection.tester;

import java.awt.List;
import java.time.LocalDate;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.AddressDTO;
import com.xworkz.collection.dto.BrandsDTO;
import com.xworkz.collection.dto.ProductDTO;
import com.xworkz.collection.dto.Type;

public class ProductTester {
	public static void main(String[] args) {
		AddressDTO address1 = new AddressDTO(1, 10, "RamdasnNager", "Ludhiana", "Punjab", 141014);
		AddressDTO address2 = new AddressDTO(2, 12, "SanjayColony", "Faridabad", "Haryana", 101213);
		AddressDTO address3 = new AddressDTO(3, 14, "Sector11", "Faridabad", "Haryana", 101218);
		AddressDTO address4 = new AddressDTO(4, 16, "Sector14", "Faridabad", "Haryana", 101220);
		AddressDTO address5 = new AddressDTO(5, 18, "Sector1", "Noida", "UP", 161014);
		AddressDTO address6 = new AddressDTO(6, 20, "ViskashColony", "Noida", "UP", 161014);
		AddressDTO address7 = new AddressDTO(7, 22, "BKNager", "Noida", "UP", 161018);
		AddressDTO address8 = new AddressDTO(8, 24, "Sahenwal", "Ludhiana", "Punjab", 141018);
		AddressDTO address9 = new AddressDTO(9, 26, "Daduwa", "Ludhiana", "Punjab", 141020);
		AddressDTO address10 = new AddressDTO(10, 28, "RamdasnNager-II", "Ludhiana", "Punjab", 141012);


		BrandsDTO brand1 = new BrandsDTO(1,"Sony"," 07AABCS1571Q1ZY",address1,LocalDate.of(1946, 05, 07));
		BrandsDTO brand2 = new BrandsDTO(1,"StellarGrove"," 07AABCS1571Q1ZY",address1,LocalDate.of(1946, 05, 07));
		BrandsDTO brand3 = new BrandsDTO(1,"QuantumCraft"," 08AABCS1571Q1ZA",address1,LocalDate.of(1986, 05, 07));
		BrandsDTO brand4 = new BrandsDTO(1,"LuminaLuxe"," 09AABCS1571Q1ZC",address1,LocalDate.of(1976, 05, 07));
		BrandsDTO brand5 = new BrandsDTO(1,"TajTaste"," 02AABCS1571Q1ZY",address1,LocalDate.of(1946, 05, 07));
		BrandsDTO brand6 = new BrandsDTO(1,"SaffronSilk"," 01AABCS1571Q1ZD",address1,LocalDate.of(1946, 05, 07));
		BrandsDTO brand7 = new BrandsDTO(1,"GangesGrove"," 05AABCS1571Q1ZY",address1,LocalDate.of(1986, 05, 07));
		BrandsDTO brand8 = new BrandsDTO(1,"MysoreMingle"," 06AABCS1571Q1ZX",address1,LocalDate.of(1976, 05, 07));
		BrandsDTO brand9 = new BrandsDTO(1,"JaipurJubilee"," 02AABCS1571Q1ZW",address1,LocalDate.of(1946, 05, 07));
		BrandsDTO brand10 = new BrandsDTO(1,"BollywoodBloom"," 07AABCS1571Q1ZS",address1,LocalDate.of(1966, 05, 07));


		ProductDTO product1 = new ProductDTO(1, "Speaker", Type.ELECTRONICS, brand10, 5000, 3);
		ProductDTO product2 = new ProductDTO(1, "Charger", Type.ELECTRONICS, brand9, 500, 3);
		ProductDTO product3 = new ProductDTO(1, "Bulb", Type.ELECTRONICS, brand8, 50, 2);
		ProductDTO product4 = new ProductDTO(1, "MTR", Type.KITCHEN, brand7, 300, 3);
		ProductDTO product5 = new ProductDTO(1, "TajRice", Type.KITCHEN, brand6, 5000, 3);
		ProductDTO product6 = new ProductDTO(1, "Bharat", Type.TRAVEL, brand5, 5000, 3);
		ProductDTO product7 = new ProductDTO(1, "FairLovely", Type.BEAUTY, brand4, 200, 2);
		ProductDTO product8 = new ProductDTO(1, "FairEyeCone", Type.BEAUTY, brand3, 5000, 3);
		ProductDTO product9 = new ProductDTO(1, "RedBus", Type.APP, brand2, 50000, 1);
		ProductDTO product10 = new ProductDTO(1, "Meta", Type.APP, brand1, 5000, 1);

		Collection<ProductDTO>pr = new HashSet<ProductDTO>();
		pr.add(product1);
		pr.add(product2);
		pr.add(product3);
		pr.add(product4);
		pr.add(product5);
		pr.add(product6);
		pr.add(product7);
		pr.add(product8);
		pr.add(product9);
		pr.add(product10);


		System.out.println("***Collect all ProductDTO by PinCode***");
		Collection<ProductDTO> prByPin = pr.stream().filter(p -> p.getBrandDTO().getAddressDTO().getPincode()== 141014)
				.collect(Collectors.toList());
		prByPin.forEach(p -> System.out.println(p));
		System.out.println("------------------------------------------------------");
		
		Collection<AddressDTO> adByName = pr.stream().sorted((p1, p2) -> p2.getId().compareTo(p1.getId()))
				.filter(p -> p.getName().equals("Charger")).map(a -> a.getBrandDTO().getAddressDTO())
				.collect(Collectors.toList());
		adByName.forEach(a -> System.out.println(a));
		System.out.println("------------------------------------------------------");

		
		System.out.println("***Collect all BrandDTO by ProductDTO***");
		Collection<BrandsDTO> brByPr = pr.stream().filter(p -> p == product10).map(b -> b.getBrandDTO())
				.collect(Collectors.toList());
		brByPr.forEach(b -> System.out.println(b));
		
		System.out.println("***Collect all Product by Max price***");
		Optional<ProductDTO>prdo=pr.stream().sorted((m1,m2)->m2.getPrice().compareTo(m1.getPrice())).findFirst();
		prdo.ifPresent(p -> System.out.println(p));
		
//		System.out.println("*** Get all AddressDTO by Product Name sort by id desc..***");	
//		pr.stream().filter((a) -> a.getBrandDTO().getAddressDTO());
	}

}
