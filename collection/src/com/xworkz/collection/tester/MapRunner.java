package com.xworkz.collection.tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapRunner {
	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(6201279485L, "Ravikant Thakur");
		map.put(9019576746L, "Adithya Neevan Gowda");
		map.put(7676739420L, "Sagar");
		map.put(9900236481L, "Servesh");
		map.put(8088064460L, "Ranjith");
		map.put(8863879862L, "Mukesh");
		map.put(8892422732L, "Bikash");
		
//		Set<Long> mobileKeys = map.keySet();
//		mobileKeys.forEach(System.out::println);   //method references
//		mobileKeys.forEach(k -> System.out.println(k));
//		map.keySet().forEach(k -> System.out.println(k));
//		
//		
//		Collection<String> value = map.values();
//		value.forEach(v -> System.out.println(v));
//		map.values().forEach(v -> System.out.println(v));
		
		System.out.println("**All name with more then 10 charac****");
		map.values().stream().filter(e ->e.length()>10).forEach(System.out::println);
		
		System.out.println("**All name with less then 10 charac****");
		map.values().stream().filter(e ->e.length()<10).forEach(System.out::println);
		
		System.out.println("**All name in Upper case****");
		map.values().stream().forEach(e -> System.out.println(e.toUpperCase()));
		
		System.out.println("**All number end with zero****");
		map.keySet().stream().filter(e->e.toString().endsWith("0")).collect(Collectors.toSet()).forEach(System.out::println);
		
		System.out.println("**All number start with 8****");
		map.keySet().stream().filter(e->e.toString().startsWith("8")).collect(Collectors.toSet()).forEach(System.out::println);
	}

}
