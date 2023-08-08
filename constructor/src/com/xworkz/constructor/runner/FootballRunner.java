package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Football;

public class FootballRunner {
public static void main(String args[]) {
	Football team1=new Football();
	
	String playersName[]= {"Ram","Hari","Ravi"};
	Football team2=new Football(playersName);
	
	String playersName1[]= {"Ram","Hari","Ravi"};
	int salary[]= {12000,20000,40000};
	Football team3=new Football(playersName,salary);
	
	String playersName2[]= {"Ram","Hari","Ravi"};
	int salary1[]= {12000,20000,40000};
	int ages[]= {18,20,25};
	Football team4=new Football(playersName,salary,ages);
	
	String clubName="TigerClub";
			Football team5=new Football(clubName);	
	team5.displayFootball();
	
	String groundName="BTM Tiger";
	Football team6=new Football(clubName,groundName);	
team6.displayFootball();

String headCoach="Sheety";
Football team7=new Football(clubName,groundName,headCoach);	
team7.displayFootball();

String clubName1="TigerClub";
String playersName3[]= {"Ram","Hari","Ravi"};
Football team8=new Football(clubName1,playersName3);	
team8.displayFootball();

String clubName2="TigerClub";
String groundName1="BTM Tiger";
String headCoach1="Sheety";
int salary2[]= {12000,20000,40000};
Football team9=new Football(clubName2,groundName1,headCoach1);
team9.displayFootball();

String clubName3="TigerClub";
String groundName2="BTM Tiger";
String headCoach2="Sheety";
String playersName4[]= {"Ram","Hari","Ravi"};
int salary3[]= {12000,20000,40000};
int ages1[]= {18,20,25};
Football team10=new Football(clubName3,groundName2,headCoach2,playersName4,salary3,ages1);
team10.displayFootball();
}
}
