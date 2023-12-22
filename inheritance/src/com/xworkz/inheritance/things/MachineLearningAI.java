package com.xworkz.inheritance.things;

public class MachineLearningAI extends AritificalIntelligence{
	protected String algorithm;
	protected String featureSelection;
	protected String hyperparameters;
	protected String trainedModel;
	
	public MachineLearningAI() {
		System.out.println("Default constructor of MachineLearningAI");
	}
	public MachineLearningAI(String algorithm,String featureSelection,String hyperparameters,String trainedModel) {
		System.out.println("All Argument constructor of MachineLearningAI");
		this.algorithm=algorithm;
		this.featureSelection=featureSelection;
		this.hyperparameters=hyperparameters;
		this.trainedModel=trainedModel;
		
	}
	public void display() {
		System.out.println("This is display method of class MachineLearningAI");
		
	}
}
