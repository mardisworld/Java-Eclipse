package _07_Conditionals;

public class _04_nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="ABCD";
		String username="James";
		if (username.equals("James")){
			System.out.println("James is a user. ");
				if (password.equals("ABCDEF")) {
					System.out.println("Successful login");
				}
				else {
					System.out.println("Your password is not correct.");
				}
		}
		else {
			System.out.println("Not recognized.");
			}
		

	}

}


	//_04_nested_if.java
	//TODO: Find an example of a nested if statement. Use it to create your own nested if.
//This is an if statement:
//
//if (condition1) {
//    // ...
//}
//This is a nested if statement:
//
//if (condition1) {
//    // ...
//    if (condition2) {
//        // ...
//    }
//    // ...
//}
//This is an if-else statement:
//
//if (condition1) {
//    // ...
//} else {
//    // ...
//}
//This is a chained if-else statement:
//
//if (condition1) {
//    // ...
//} else if (condition2) {
//    // ...
//}
//http://stackoverflow.com/questions/3639220/in-java-is-this-considered-an-example-of-a-nested-if-statement
//https://www.cs.umd.edu/~clin/MoreJava/ControlFlow/nested-if.html