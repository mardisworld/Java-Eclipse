package _12_Movies;


public class Movie_Objects {

	public static void main(String[] args) {
		Movie theUsualSuspects= new Movie("The Usual Suspects", "R", "Drama", false, false, 150150.0, 350350.0);
		//theUsualSuspects.actors.add("Kevin Spacey");
		//theUsualSuspects.actors[1]= "Gabriel Byrne";
		//theUsualSuspects.actresses[0]= "Suzy Amis";
		//theUsualSuspects.actresses[1]= "Christine Estabrook";
		theUsualSuspects.genre="Drama/Thriller";
		theUsualSuspects.onHBO=false;
		theUsualSuspects.boxOfficeGross=100000000;
		theUsualSuspects.movieLength=106;
		
		Movie tommyBoy=new Movie("Tommy Boy", "PG-13", "Comedy", false, false, 550450.0, 123456.0);
		tommyBoy.movieLength=120;
		tommyBoy.boxOfficeGross=500000;
		
		//System.out.println(theUsualSuspects.genre);
		System.out.println(theUsualSuspects.movieLength); //this works the same as calling a method I created for printing below 106 (assigned this on line 16)
		theUsualSuspects.getMovieLength(); //for the Usual Suspects (This calls the  method) 106
		tommyBoy.getMovieLength();  //for Tommy Boy 120 (assigned this on line 16)
		
		
	    Movie blackSwan = new Movie("Black Swan", "R", "drama:", false, false, 5000000.0, 20000000);

		System.out.println(theUsualSuspects.boxOfficeGross); //this works the same as calling a method I created for printing below
		theUsualSuspects.getBoxOfficeGross(); //(This calls the  method)
		tommyBoy.getBoxOfficeGross(); //(This calls the  method)
		blackSwan.getBoxOfficeGross();
	}

}
