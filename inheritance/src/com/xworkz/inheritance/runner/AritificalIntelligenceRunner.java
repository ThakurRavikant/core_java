package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.AritificalIntelligence;
import com.xworkz.inheritance.things.ChatbotAI;

public class AritificalIntelligenceRunner extends AritificalIntelligence {
	public static void main(String[] args) {
		AritificalIntelligence ai = new ChatbotAI();
		ai.display();
	}

}
