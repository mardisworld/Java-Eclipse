package _19_Friends_Challenge;

public class Friend {

		private String name;
		private String state;
		private int birthMonth;
		private int birthDay;
		private int birthYear;
		
		//Constructor goes in class file. Constructors are public in the class name. 
			//A constructor is a method that has the same name as the class itself - it builds our instances or objects of that class type
			// Before, we had Friend Gary = new Friend();
			//Now we are going to build a constructor that does more for us
		 	//*having a constructor means that when you create a new object it has to have *all* the parameters
		
		Friend(String name, String state, int birthMonth, int birthDay, int birthYear) {
			this.name=name;			
			this.state=state;				
			this.birthMonth=birthMonth;
			this.birthDay=birthDay;
			this.birthYear=birthYear;
		}
			
			
			//Getters should return values
			public String getName(){
				return name;
				//can also print value when you call the method to getParameter//
				
			}
			
			public String getState(){
				return state;
				//System.out.println(status); TODO//
			}
				
			public int getbirthMonth(){
				return birthMonth;
			}
			
			public int getbirthDay(){
				return birthDay;
			}
			
			public int getbirthYear(){
				return birthYear;
			}
		
			
			
			//Setters
			public void setNewFriendName(String newName){
				this.name=newName;	// dont' have to have this, can just say name=newName;//
			}
			
			public void setState(String newState){
				state=newState;	// dont' have to have this, can just say name=newName;//
	
			}
			
			public void setBirthMonth(int newBirthMonth){
				this.birthMonth=newBirthMonth;
			}
			
			public void setBirthDay(int newBirthDay){
				this.birthDay=newBirthDay;
			}
	
			public void setBirthYear(int newBirthYear){
				this.birthYear=newBirthYear;
			}
		
}

