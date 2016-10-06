package _14_Constructor_Employee;

public class Manager extends Employee {
	
	public String department;
	
	public Manager(String name, double salary, int startYear, int birthYear, String department) {
	super(name, salary, startYear, birthYear);
	this.department=department;

}


}