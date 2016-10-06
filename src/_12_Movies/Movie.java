package _12_Movies;

public class Movie {

	
	//properties
	
	String title;
	String rating;
	//String[] actors;
	//String[] actresses;
	String genre;
	boolean ratedX;
	boolean onNetflix;
	boolean onHBO;
	boolean inTheatres;
	double openingWeekend;
	double boxOfficeGross;
	int movieLength;
	boolean turnedProfit;
	
	
	//Methods
	public void getMovieLength() {
		System.out.println(movieLength); //method to print movie length
	
}
	
	//create a new method that prints boxOfficeGross
	public void getBoxOfficeGross() {
		System.out.println("The movie made: $" + boxOfficeGross); //method to print movie length
	
}
	
	//create a constructor for a movie(see Employee files)
	
	Movie(String title, String rating, String genre, boolean ratedX, boolean inTheatres, double openingWeekend, double boxOfficeGross) {
		this.title=title;			
		this.rating=rating;				
		this.genre=genre;
		this.ratedX=ratedX;
		this.inTheatres=inTheatres;
		this.openingWeekend=openingWeekend;
		this.boxOfficeGross=boxOfficeGross;
		

}
	
	
}
