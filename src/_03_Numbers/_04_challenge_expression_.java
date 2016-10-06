package _03_Numbers;

public class _04_challenge_expression_ {

	public static void main(String[] args) {

		
	    // A college charges $30,000 per year for tuition
	    double annualTuition = 30000.00;
	    
	    System.out.println("It costs $" + annualTuition + " to attend our college");
	    
	    //
	    double fourYrTuition=annualTuition*4;
	    
	    System.out.println("Over the course of four years, you will spend $" + fourYrTuition);
	    //Thom's parents saved $10000 every year for 18 years
	 
	    
	    double annualCollegeSavings=10000;
	    
	    double totalCollegeSavings=0.0;
	    
	    for (int ThomsAge=0;ThomsAge<=18;ThomsAge++){
	    	totalCollegeSavings+=annualCollegeSavings;
	    	
	    	
			System.out.println("At age " + ThomsAge +" Thom's parents will have saved " + "$" + totalCollegeSavings);
		
		}
	    
	    double retirementSavings=totalCollegeSavings-fourYrTuition;
	    System.out.println("You will have $" + retirementSavings + " left for your retirement after Thom graduates from college.");
	    


		    

		  }
		
}
