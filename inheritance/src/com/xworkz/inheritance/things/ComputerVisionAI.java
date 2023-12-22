package com.xworkz.inheritance.things;

public class ComputerVisionAI extends AritificalIntelligence {
	protected String imageProcessor;
	protected String objectDetector;
	protected String faceRecognizer;
	protected String imageClassifier;
	
	public ComputerVisionAI() {
		System.out.println("Default constructor of ComputerVisionAI");
	}
	public ComputerVisionAI(String imageProcessor,String objectDetector,String faceRecognizer,String imageClassifier) {
		System.out.println("All Argument constructor of ComputerVisionAI");
		this.imageProcessor=imageProcessor;
		this.objectDetector=objectDetector;
		this.faceRecognizer=faceRecognizer;
		this.imageClassifier=imageClassifier;
		
	}
	public void display() {
		System.out.println("This is display method of class ComputerVisionAI");
		
	}
}
