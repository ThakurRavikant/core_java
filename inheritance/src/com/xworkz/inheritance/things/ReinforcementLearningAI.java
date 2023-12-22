package com.xworkz.inheritance.things;

public class ReinforcementLearningAI extends AritificalIntelligence {
	protected String environment;
	protected String policy;
	protected String valueFunction;
	protected String rewardFunction;
	
	public ReinforcementLearningAI() {
		System.out.println("Default constructor of ComputerVisionAI");
	}
	public ReinforcementLearningAI(String environment,String policy,String valueFunction,String rewardFunction) {
		System.out.println("All Argument constructor of ComputerVisionAI");
		this.environment=environment;
		this.policy=policy;
		this.valueFunction=valueFunction;
		this.rewardFunction=rewardFunction;
		
	}
	public void display() {
		System.out.println("This is display method of class ReinforcementLearningAI");
		
	}

}

