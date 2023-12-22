package com.xworkz.repo;

public interface PoliticanRepository {
	int TOTAL_NUM=5;
	void save(String names);
	 void display() ;
 default String[] findStartswith(String name) {
	 return null;
 }
}
