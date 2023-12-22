package com.xworkz.inheritance.things;

public class NaturalLanguageProcessingAI extends AritificalIntelligence {
	protected String tokenizer;
	protected String posTagger;
	protected String sentimentAnalyzer;
	protected String languageModel;
	
	public NaturalLanguageProcessingAI() {
		System.out.println("Default constructor of NaturalLanguageProcessingAI");
	}
	public NaturalLanguageProcessingAI(String tokenizer,String posTagger,String sentimentAnalyzer,String languageModel) {
		System.out.println("All Argument constructor of NaturalLanguageProcessingAI");
		this.tokenizer=tokenizer;
		this.posTagger=posTagger;
		this.sentimentAnalyzer=sentimentAnalyzer;
		this.languageModel=languageModel;
		
	}
	public void display() {
		System.out.println("This is display method of class NaturalLanguageProcessingAI");
		
	}

}
