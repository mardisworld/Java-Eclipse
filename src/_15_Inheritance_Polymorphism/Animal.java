package _15_Inheritance_Polymorphism;

import java.util.Scanner;

public class Animal {
	
	Scanner scan = new Scanner(System.in); //scan is an object (if something is not a primitive type it is an object)
	
	//Properties
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifespan;
	public boolean isWarmBlooded;
	public String name;
	public String habitat;
	
	
	
	
	
	//Methods
	//create a new method that prints boxOfficeGross
	public void printName() {
		System.out.println("My name is " + name + "." ); //method to print name
	
}
	
	public void printNumTeeth() {
		System.out.println("I have " + numTeeth + " teeth." ); //method to print number of teeth
	
}
	
	public void printHabitat() {
		System.out.println("I live in the " + habitat + " habitat." ); //method to print habitat
	
}

//	public void getNumEyes(){
//		System.out.println("How many eyes do you have? "); 
//		int numEyes=scan.nextInt();						//takes input from user for number of teeth
//		System.out.println(name + " has " + numEyes + " eyes. "); //outputs number of eyes
//		
//	}
	
	public void speak() {
		System.out.println("I am an animal.");
	}
	
	public void foodILike() {
	System.out.println("I love to eat food");

}

	
}
	//scan.close(); //This closes the scanner to save memory
//need to close scanner but need to move on