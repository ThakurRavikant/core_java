package com.xworkz.instanceVariable.thing;

import java.util.Date;

public class Military {
	public String type;
	public String locaton;
	public String campName;
	public String numOfSoilder;
	public String numOfMission;
	public Date joindate;
	
	public Military() {
		System.out.println("This is default Constructor");
	}
 public Military(String type,String locaton,String campName,String numOfSoilder,String numOfMission,Date joindate) {
	 System.out.println("All argument constructor");
 }
 public void defencing() {
	 System.out.println("This is defence method"); 
 }
 public void protecting() {
	 System.out.println("This is defence method"); 
 }
 public void investigating() {
	 protecting();
	 System.out.println("This is defence method"); 
 }
 public void selectionProcess() {
	 investigating();
	 System.out.println("This is defence method"); 
 }
 public void trainingPSrocess() {
	 System.out.println("This is defence method"); 
 }
 
}
