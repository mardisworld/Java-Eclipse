
public class Marissa_Staller_Assessment_3 {

	public static void main(String[] args) {
	/*1 -  Variables: Create two integer variables. Then, create another variable that stores the value  
	       of those variables when they are added together. Print the value of that variable to the console.*/
		int num1=10;
  		int num2=25;
  		int sum=num1+num2;
  		System.out.println("The sume of num1 and num2 is: " + sum +".");
	/*2 -  Conditionals: Create an else if statement that considers the speed at which a vehicle is  
	       moving. Handle at least 3 different speeds. */
  			int speed=65;
  			int speedLimit=55;
  			if (speed <=45) {
  				System.out.println("You are driving too slow. Please speed up");
  			}
  			else if ((speed>45) && (speed<=55)) {
  				System.out.println("You are driving at an acceptable pace.");
  			}
  			else if ((speed>55) && (speed<=65)){
  				System.out.println("You are over the speed limit, but I am not going to pull you over.");
  			}
  			else if (speed>65) {
  				System.out.println("You are in danger of being ticketed for speeding.");
  			}
	
	/*3 -  Collections: Create an array of your 4 favorite movies or tv shows. Print the third item in
	       the array to the console.*/
  			String[] movies={"Les Miserables", "Pride and Predjudice", "Pulp Fiction", "Star Trek: Beyond"};
  			System.out.println("One of my favorite movies is " + movies[2] + ".");
	
	/*4 -  Loops: Create a foreach loop that prints all of the items in the array above.*/
  			int i;
  			for (i=0; i<=(movies.length-1);i++){
  				System.out.println(movies[i] + ", ");
  			}
	
	/*5 -  Loops: Create a for loop that prints from 10 to 1.*/
  			int j;
  			for (j=10; j>=0;j--){
  				if (j!=0) {
  					System.out.println(j);
  				}
  			}

	/*6 -  Classes: In another file, create a Gameshow class that has 2 public  
	       properties: Name and number of years on television. */
  				//*done in gameShow.java//
			
	/*7 -  Objects: Make an object from the Gameshow class and set both    
	       properties. (Don't use a constructor to do this.) */
  			gameShow wheelOfFortune= new gameShow();
  			wheelOfFortune.name="Wheel of Fortune";
  			wheelOfFortune.numYrsOnTv=30;
  			
	/*8 -  Classes: Make another class called HomeAppliance. Make 2 private properties: name and price.  Make those properties private. */
				//*done in HomeAppliance.java//
	/*9 -  Classes: Create a constructor that allows HomeAppliance objects to be created. The constructor should use both of the variables above. */
  				//*done in HomeAppliance.java//
	/*10 - Classes: Add 2 getters to the HomeAppliance class: getPrice & getName. getPrice should return price and getName should return the name. You should also add syso statements inside the methods that print out the variable values to the console.  */
  				//*done in HomeAppliance.java//
	/*12 - Classes: Add 1 setter called setPrice. This setter should have a parameter that allows users to update the price of the product.*/
  				//*done in HomeAppliance.java//
	/*13 - Objects: Using the constructor, make an object from the HomeAppliance class in the space below. After making the object, run the getPrice method on that object. Then, run the set price on that product and change the price. */
  			HomeAppliance dishwasher=new HomeAppliance("Whirlpool 24' Dishwasher", 269.99);
  			System.out.println("The " + dishwasher.getName() + " costs $" + dishwasher.getPrice() + ".");
  			dishwasher.setNewPrice(249.00);
  			System.out.println("The " + dishwasher.getName() + " is on sale for $" + dishwasher.getPrice() + ".");
	}

}
