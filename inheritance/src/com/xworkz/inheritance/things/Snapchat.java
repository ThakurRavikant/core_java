package com.xworkz.inheritance.things;

public class Snapchat extends Application{
public String feature;
public int downloadUser;
public String userName;
public int version;

public Snapchat() {
	System.out.println("No Argument constructor ");
}
public Snapchat(String feature,int downloadUser,String userName, int version) {
	System.out.println("All Argument constructor ");
	this.feature=feature;
	this.downloadUser=downloadUser;
	this.userName=userName;
	this.version=version;
}

}
