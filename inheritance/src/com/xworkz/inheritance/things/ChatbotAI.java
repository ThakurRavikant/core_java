package com.xworkz.inheritance.things;

public class ChatbotAI extends AritificalIntelligence{
	protected String intentClassifier;
	protected String entityRecognizer;
	protected String responseGenerator;
	protected String contextManager;
	
	public ChatbotAI() {
		super();
		System.out.println("Default constructor of ComputerVisionAI");
	}
	public ChatbotAI(String intentClassifier,String entityRecognizer,String responseGenerator,String contextManager) {
		System.out.println("All Argument constructor of ComputerVisionAI");
		this.intentClassifier=intentClassifier;
		this.entityRecognizer=entityRecognizer;
		this.responseGenerator=responseGenerator;
		this.contextManager=contextManager;
		
	}
	public void display() {
		System.out.println("This is display method of class ChatboatAI");
		
	}
}
