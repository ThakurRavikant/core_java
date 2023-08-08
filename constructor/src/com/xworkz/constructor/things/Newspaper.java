package com.xworkz.constructor.things;

public class Newspaper {
	public String articlesName;
	public String publication;
	public int pages;
	public int numberOfWords;
	public boolean story;

	public Newspaper() {
		System.out.println("The constructor with no argument is");
	}
	public Newspaper(String articlesName,String publication,int pages,int numberOfWords,boolean story) {
		this.articlesName=articlesName;
		this.publication=publication;
		this.pages=pages;
		this.numberOfWords=numberOfWords;
		this.story=story;
		
	}
	public void display() {
		System.out.println("articlesName:"+this.articlesName+" "+"publication:"+this.publication+" "+"pages:"+this.pages+" "
				+"numberOfWords:"+this.numberOfWords+" "+"story:"+this.story);
	}
}

