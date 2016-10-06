package _13_Friends;


public class Friend_Objects {

	public static void main(String[] args) {
		

		//Each friend is an object or instance of the Friend class. 
				Friend Gary = new Friend();
				Gary.firstName="Gary"; //.is an operator kind of like + or - or * / or %
				Gary.lastName="Staller";
				Gary.birthYear=1952;
				Gary.hsGraduationYr=1970;
				Gary.collegeGraduationYr=1974;
				Gary.collegeName="Penn State";
				Gary.currentCity="Philadelphia";
				Gary.hometown="Philadelphia";
				Gary.isFemale=false;
				Gary.isMarried=false;
				Gary.isOnline=true;
				Gary.numYearsFriends=20;
				
				Gary.onlineCheck();
				Gary.cityCheck();
				Gary.getCollege();
				Gary.printYearsFriends();
	}

}
