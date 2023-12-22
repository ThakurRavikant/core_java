package com.xworkz.inheritance.things;

public class AritificalIntelligence {
	protected String name;
	protected String version;
	protected String description;
	protected byte learningRate;
	protected int inputSize;
	protected int outputSize;
	protected String activationFunction;
	protected double weights;
	protected String biases;
	protected String trainingData;
	protected String lossFunction;
	protected int numLayers;
	protected int layerSizes;
	protected int maxIterations;
	protected String optimizer;
	protected String learningAlgorithm;
	protected String currentIteration;
	protected String isTrained;
	protected String trainedModel;
	protected boolean performanceMetrics;
	
	public AritificalIntelligence() {
		System.out.println("Default constructor of Artifical-Intelligence");
	}
	
	public AritificalIntelligence(String name,String version,String description,byte learningRate,int inputSize,int outputSize
			,String activationFunction,double weights,String biases,String trainingData,String lossFunction, int numLayers,int layerSizes,
			int maxIterations,String optimizer,String learningAlgorithm,String currentIteration, String isTrained,String trainedModel,
			boolean performanceMetrics) {
		System.out.println("Default constructor of Artifical-Intelligence");
		this.name=name;
		this.version=version;
		this.description=description;
		this.learningRate=learningRate;
		this.inputSize=inputSize;
		this.outputSize=outputSize;
		this.activationFunction=activationFunction;
		this.weights=weights;
		this.biases=biases;
		this.trainingData=trainingData;
		this.lossFunction=lossFunction;
		this.numLayers=numLayers;
		this.layerSizes=layerSizes;
		this.maxIterations=maxIterations;
		this.optimizer=optimizer;
		this.learningAlgorithm=learningAlgorithm;
		this.currentIteration=currentIteration;
		this.isTrained=isTrained;
		this.trainedModel=trainedModel;
		this.performanceMetrics=performanceMetrics;
		
	}
	public void display() {
		System.out.println("This is display method of class ArtificlaIntelligence");
		
	}

}
