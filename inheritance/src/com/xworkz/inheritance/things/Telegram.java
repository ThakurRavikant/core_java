package com.xworkz.inheritance.things;

public class Telegram extends Application {
public String groupName;
public int numOfSubscriber;
public String version;
public int num_channel;

public Telegram() {
	System.out.println("no Argument Constructor");
}
public Telegram(String groupName,int numOfSubscriber,String version,int num_channel) {
	this.groupName=groupName;
	this.numOfSubscriber=numOfSubscriber;
	this.version= version;
	this.num_channel=num_channel;
	System.out.println("All argument costructor");
}
}
