package _19_Friends_Challenge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Friend user1=new Friend ("Gary", "Pennsylvania", 11, 10, 1952);
		Friend user2=new Friend ("Lindsey", "Arizona", 6, 17, 1978);

		System.out.println(user2.getbirthMonth());
		System.out.println(user1.getName());
		
		if (user1.getName().equals(user2.getName())){
			System.out.println("Names are the same.");
		}
		else {
			System.out.println("Names are different");
		}
		
		if (user1.getbirthMonth()==user2.getbirthMonth()){
			System.out.println("These two friends were born in the same month.");
		}
		else{
			System.out.println("These two friends were born in different months");
}
		
}
	
}