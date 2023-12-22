package com.xworkz.abstractconcept.runner;



import java.util.Date;

import com.xworkz.abstractconcept.things.Department;
import com.xworkz.abstractconcept.things.Employee;
import com.xworkz.abstractconcept.things.Investor;
import com.xworkz.abstractconcept.things.Isro;
import com.xworkz.abstractconcept.things.Lab;
import com.xworkz.abstractconcept.things.Machine;
import com.xworkz.abstractconcept.things.Research;

public class IsroRunner {
public static void main(String[] args) {
	Isro isro = new Isro(new Department(new Research(new Employee(new Lab(new Investor(new Machine()))))));
	
	
}
}
