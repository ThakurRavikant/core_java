package com.xworkz.repo;

public interface CountryRepository {

	int ITEMS = 10;

	void saveCount(String name);

	default boolean isExists(String name) {
		return false;
	}

	default String findReturnUpperCase(String name) {
		return null;
	}

	default String[] findStartsWith(String name) {
		return null;
	}

	default String[] findEndsWith(String name) {
		return null;
	}

	default String[] orderDescending() {
		return null;
	}

	default String[] orderAscending() {
		return null;
	}

	void display();

}



