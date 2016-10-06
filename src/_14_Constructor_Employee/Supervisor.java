package _14_Constructor_Employee;

public class Supervisor extends Employee{ 
	
	public String department;
	public String securityLevel;
	
	public Supervisor(String name, double salary, int startYear, int birthYear, String department, String securityLevel) {
	super(name, salary, startYear, birthYear);
	this.department=department;
	this.securityLevel=securityLevel;

}

}



