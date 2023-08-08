package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.OperatingSystem;

public class OperatingSystemRunner {
	public static void main(String args[]) {
		OperatingSystem ab1=new OperatingSystem();
		
		OperatingSystem ab2=new OperatingSystem();
		ab2.name="Windows";
		ab2.type="Computer Operating system";
		ab2.developedBy="Microsoft Corporation";
		ab2.founder="Bill Gates";
		ab2.firstVersion="Windows MS-DOS";
		ab2.released="1985";
		ab2.latestVersion="Windows 11";
		ab2.releasedOn="2021";
		ab2.versions=46;
		ab2.functions="Memory management";
		
		System.out.println("Name of OS:"+ab2.name);
		System.out.println("Type of OS:"+ab2.type);
		System.out.println("Deveeloped by:"+ab2.developedBy);
		System.out.println("Founder:"+ab2.founder);
		System.out.println("First Version:"+ab2.firstVersion);
		System.out.println("Released in:"+ab2.released);
		System.out.println("Latest Version:"+ab2.latestVersion);
		System.out.println("Released on:"+ab2.releasedOn);
		System.out.println("Number of versions till now:"+ab2.versions);
		System.out.println("Functions:"+ab2.functions);
	}

}
