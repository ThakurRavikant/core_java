package com.xworkz.runner;

import com.xworkz.things.Password;
import com.xworkz.things.PasswordException;

public class PasswordRunner {
	public static void main(String[] args) throws PasswordException {
		Password password = new Password("Xwork@12");
		System.out.println(password.toString());
		String ref=password.getPassword().substring(0, 1);
		String result=ref.toUpperCase();
		if(result.equals(ref)) {
			throw new PasswordException("It should contain atleast 1 captial latter");

		}else if(password.getPassword().length()==9) {

			throw new PasswordException("Password is more than length");

		}else if (password.getPassword().contains("@")) {
			throw new PasswordException("It should contain atleast 1 special character");
		}

	}
}

