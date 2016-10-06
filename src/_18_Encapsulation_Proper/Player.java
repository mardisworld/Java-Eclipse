package _18_Encapsulation_Proper;

public class Player {
	private String name;
	private String status;
	private int highScore;
	private String healthPoint;
	
	//Constructor goes in class file. Constructors are public in the class name. 
		//A constructor is a method that has the same name as the class itself - it builds our instances or objects of that class type
		// Before, we had Friend Gary = new Friend();
		//Now we are going to build a constructor that does more for us
	 	//*having a constructor means that when you create a new object it has to have *all* the parameters
	
	Player(String name, String status, int highScore, String healthPoint) {
		this.name=name;			//connects to line 10 this.wholename
		this.status=status;				//this.salary
		this.highScore=highScore;
		this.healthPoint=healthPoint;

}
	
	//Getters
	//Get access to private variables by making methods public
	
	public String getName(){
		return name;
		//can also print value when you call the method to getParameter//
		
	}
	
	public String getStatus(){
		return status;
		//System.out.println(status); TODO//
	}
		
	public int gethighScore(){
		return highScore;
	}
	
	public String gethealthPoint(){
		
		System.out.println(healthPoint);
		return healthPoint;
	}
	
	//Setters*TODO Check if you did setters correctly//
	//Set variables to constructor 
	
	public void setNewPlayerName(String newName){
		this.name=newName;	// dont' have to have this, can just say name=newName;//
	}
	
	public String setStatus(String newStatus){
		status=newStatus;	// dont' have to have this, can just say name=newName;//
		System.out.println(status);
		return status;  //can return a value, but need to declare it as value instead of void
	}
	
	public void sethighScore(int newHighScore){
		this.highScore=newHighScore;
	}
	

}
