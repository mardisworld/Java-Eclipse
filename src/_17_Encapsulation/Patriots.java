package _17_Encapsulation;

public class Patriots {
	public String name; //public can access from outside the package if you import the package
	private int number; //private can access within the class
	protected int age; //protected can access in that package
	
	
	//build setters
	public void setNumber(int number){
		this.number=number; //will set private variable
	}
	
	//and build getters 
	
	public Integer getNumber(){
		return this.number;
	}

}


//Create a class of Patriots
//3 variables within the three types
//Create 