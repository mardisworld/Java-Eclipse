package _17_Encapsulation;

public class ColtsPlayers {
	public String name; //public can access from outside the package if you import the package
	private String status; //private can access within the class
	protected int num; //protected can access in that package
	protected String healthStatus;
	
	public ColtsPlayers(String name, String status, int num, String healthStatus){
		this.name=name;
		this.status=status;
		this.num=num;
		this.healthStatus=healthStatus;
		
	}
	
	
	//build setters
	public void setNumber(int number){
		this.num=num; //will set private variable
	}
	
	//and build getters 
	
	public Integer getNumber(){
		return this.num;
	}

}
