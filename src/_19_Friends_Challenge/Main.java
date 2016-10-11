package _19_Friends_Challenge;

public class Main {

	public static void main(String[] args) {
		Friend user1 = new Friend("Zack", 300, false);
		Friend user2 = new Friend("James", 500, true);
		
		System.out.println(user1.getName());
		System.out.println(user2.getName());
		
		System.out.println("Paul " + user1.getOnlineStatus());
		System.out.println("James " + user2.getOnlineStatus());
		
		user1.setOnlineStatus(true);
		user2.setOnlineStatus(false);
		
		System.out.println("Paul " + user1.getOnlineStatus());
		System.out.println("James " + user2.getOnlineStatus());
		
		if (user1.getName().equals(user2.getName())) {
			System.out.println("Names are the same");
		} else {
			System.out.println("Names are different");
		}
		
		if (user1.getFriendNum() == user2.getFriendNum()) {
			System.out.println("The users have the same number of friends");
		} else if (user1.getFriendNum() > user2.getFriendNum()) {
			System.out.println(user1.getName() + " has more friends than " + user2.getName());
		} else {
			System.out.println(user2.getName() + " has more friends than " + user1.getName());
		}
		
//		Friend user1=new Friend ("Gary", "Pennsylvania", 11, 10, 1952);
//		Friend user2=new Friend ("Lindsey", "Arizona", 6, 17, 1978);
//
//		System.out.println(user2.getbirthMonth());
//		System.out.println(user1.getName());
//		
//		if (user1.getName().equals(user2.getName())){
//			System.out.println("Names are the same.");
//		}
//		else {
//			System.out.println("Names are different");
//		}
//		
//		if (user1.getbirthMonth()==user2.getbirthMonth()){
//			System.out.println("These two friends were born in the same month.");
//		}
//		else{
//			System.out.println("These two friends were born in different months");
//}
		
}
	
}