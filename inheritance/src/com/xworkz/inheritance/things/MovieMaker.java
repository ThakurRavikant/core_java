package com.xworkz.inheritance.things;

public class MovieMaker {
	    public String movieTitle;
	    public int releaseYear;
	    public String director;
	    public String actors;
	    public String genre;
	    public double rating;
	    public int durationMinutes;
	    public String language;
	    public boolean isReleased;
	    public String filePath;

	    public MovieMaker() {
			System.out.println("No argument constructor of Movie Maker class");
		}
	   
	    public MovieMaker(String movieTitle, int releaseYear, String director, String actors, String genre,
				double rating, int durationMinutes, String language, boolean isReleased, String filePath) {
		
			this.movieTitle = movieTitle;
			this.releaseYear = releaseYear;
			this.director = director;
			this.actors = actors;
			this.genre = genre;
			this.rating = rating;
			this.durationMinutes = durationMinutes;
			this.language = language;
			this.isReleased = isReleased;
			this.filePath = filePath;
		}

		@Override
		public String toString() {
			return movieTitle+" "+releaseYear+" "+director+" "
		+actors+" "+genre+" "+rating+" "+durationMinutes+" "+language+" "+isReleased+" "+filePath;
		}
	    @Override
	    public boolean equals(Object moviemaker) {
			return(moviemaker=="Way of Water");
		}
}
