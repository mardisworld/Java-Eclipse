package _07_Conditionals;

public class _05_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int whiteCastlesEaten=20;
		String response;
		
		switch(whiteCastlesEaten) {
			case 0:
				response="That's probably smart." ; //different syntactically
				break;
			case 1:
				response="One burger is okay.";
				break;
			case 5:
				response="Are you feeling okay?";
				break;
			case 10:
				response="Don't you feel sick?";
				break;
			case 20:
				response="I think we should go to the hospital.";
				break;
			default:
				response="White Castle rocks.";
				break;
		}
		System.out.println(response);
			
	}

}

//Need default to assign a response in case the variable has not been defined 