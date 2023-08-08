package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Telegram;

public class TelegramRunner {
public static void main(String args[]) {
	Telegram users=new Telegram();
	
	
	//users.audiocall();
	//users.chatting();
	
	
	users.setType("Appllication");
	users.setNumberOfGroup(1000000);
	users.setViwers("4.5 Million");
	users.setFounder("Jeff Boezo");
	users.setNumberOfChannels(125354);
	users.setEstd("30 Dec 1991");
	users.setProfit(256800000);
	users.setService(true);
	users.setRating("6*");
	users.setLoss(82500000);
	
	
	System.out.println(users.getType());
	System.out.println(users.getNumberOfGroup());
	System.out.println(users.getViwers());
	System.out.println(users.getFounder());
	System.out.println(users.getNumberOfChannels());
	System.out.println(users.getEstd());
	System.out.println(users.getProfit());
	System.out.println(users.getService());
	System.out.println(users.getRating());
	System.out.println(users.getLoss());
	
	
	users.display();
}
}
