package com.xworkz.collection.tester;

import java.text.Collator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.ActorDTO;

public class ActorTester {
	public static void main(String[] args) {
		ActorDTO actor1=new ActorDTO(1.0,"Tom Cruse","English","Male","USA");
		ActorDTO actor2=new ActorDTO(2.0,"Anuska","Hindi","Female","India");
		ActorDTO actor3=new ActorDTO(3.0,"Rock","English","Male","USA");
		ActorDTO actor4=new ActorDTO(4.0,"Ven D ","English","Male","USA");
		ActorDTO actor5=new ActorDTO(5.0,"SRK","Hindi","Male","India");
		ActorDTO actor6=new ActorDTO(6.0,"Rekha","Nepali","Female","Nepal");
		ActorDTO actor7=new ActorDTO(7.0,"RKS","Hindi","Male","India");
		ActorDTO actor8=new ActorDTO(8.0,"ViratBhatt","Nepali","Male","Nepal");
		ActorDTO actor9=new ActorDTO(9.0,"Prabhas","Telegu","Male","India");
		ActorDTO actor10=new ActorDTO(10.0,"Tony Stark","English","Male","USA");

		Collection<ActorDTO> collection = new HashSet<ActorDTO>();
		collection.add(actor10);
		collection.add(actor1);
		collection.add(actor3);
		collection.add(actor7);
		collection.add(actor8);
		collection.add(actor5);
		collection.add(actor2);
		collection.add(actor4);


		//			System.out.println("====================");
		collection.stream().sorted().forEach(b -> System.out.println(b));

		System.out.println("<<---Collect all unique countries using map and collect");
		Set<String> countries = collection.
				stream()
				.map(ref-> ref.getCountry())
				.collect(Collectors.toSet());
		countries.forEach(b -> System.out.println(b));;
		//1
		System.out.println("<<---Collect all unique countries using map and collect in uppercase");
		Set<String> countries1 = collection
				.stream()
				.map(ref-> ref.getCountry().toUpperCase())
				.collect(Collectors.toSet());
		countries1.forEach(b -> System.out.println(b));

		//2	
		System.out.println("Countries in Uppercase in descending order");
		collection.stream().sorted((a1,a2)->a2.getCountry()
				.compareTo(a1.getCountry())).map(ref->ref.getCountry().toUpperCase())
		.collect(Collectors.toList()).forEach((c)->System.out.println(c));

		//3
		System.out.println("Printing ID in ascending order");
		collection.stream().map(ref->ref.getId()).sorted().collect(Collectors.toList())
		.forEach((c)->System.out.println(c));

		//4
		System.out.println("All actors in ascending order by language known");
		collection.stream().sorted((e1,e2)->e1.getLangKnow().compareTo(e2.getLangKnow()))
		.forEach((c)->System.out.println(c));

		//5
		System.out.println("All actors in descending order by language known");
		collection.stream().sorted((e1,e2)->e2.getLangKnow().compareTo(e1.getLangKnow()))
		.forEach((c)->System.out.println(c));

		//6
		System.out.println("Printing  male actors ");
		collection.stream().sorted((a1,a2)->a1.getId().compareTo(a2.getId()))
		.filter((e) -> e.getGender() == "Male").forEach((e) -> System.out.println(e.toString()));

		//7
		System.out.println("Printing  Female actors in descending order by name");
		collection.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName()))
		.filter((e) -> e.getGender() == "Female").forEach((e) -> System.out.println(e.toString()));

		//8
//		System.out.println("Printing by country");
//		collection.stream().sorted((e1,e2)->e1.getCountry().compareTo(e2.getCountry())).filter((e) -> e.getCountry())


		//9
		System.out.println("Printing actors having ID more than 5 ");
		collection.stream().sorted((a1,a2)->a1.getId().compareTo(a2.getId()))
		.filter((e) -> e.getId() > 5).collect(Collectors.toList()).forEach((e) -> System.out.println(e.toString()));

	}

}
