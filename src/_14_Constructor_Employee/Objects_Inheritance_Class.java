package _14_Constructor_Employee;

public class Objects_Inheritance_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee Jenn = new Employee("Jenn", 100000.00, 1980, 2015);
		System.out.println(Jenn.salary);
		Manager e200=new Manager("Sydney", 100000, 1996, 2016, "Java");
		
		System.out.println(e200.wholename);
		System.out.println(e200.department);
		
				//System.out.println(Jenn.wholename.department); This isn't allowed to happen because e200 Jenn is not a manager, 
				//which  has an extra parameter or property
		
		Supervisor tina = new Supervisor("Tina Holt", 100000.00, 1952, 2016, "Java", "Top Level security clearance");
		System.out.println(tina.wholename);
		System.out.println(tina.wholename + " is in charge of the " + tina.department + " department and has " + tina.securityLevel + ".");
		
		
	}

}



//Supervisor class, Janitor class, Cashier Class, YesMan
//inherit from Employee
//build a constructor for your new class
//create a new property
//In Objects_Inheritance create that new class and use some of its methods