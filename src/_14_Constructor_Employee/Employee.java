package _14_Constructor_Employee;


public class Employee {
	
	//String name default is public e.g. public String name;
	
	//properties
	public String wholename; //sets to private  connects to line 21
 	protected double salary;
 	int startYear;
 	int birthYear;
	
	//Constructor goes in class file.
	//A constructor is a method that has the same name as the class itself - it builds our instances or objects of that class type
	// Before, we had Friend Gary = new Friend();
	//Now we are going to build a constructor that does more for us
 	//*having a constructor means that when you create a new object it has to have *all* the parameters
	
	Employee(String name, double salary, int startYear, int birthYear) {
			this.wholename=name;			//connects to line 10 this.wholename
			this.salary=salary;				//this.salary
			this.startYear=startYear;
			this.birthYear=birthYear;
			

}
	
}
