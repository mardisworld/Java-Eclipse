package _16_Interfaces;

public class CD implements IFunctions{
	
	String title;

	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD is now playing.");
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD is now stopped.");
		
	}

	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next song.");
		
	}

	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Show CD Menu");
		
	}

	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("CD is now paused.");
		
	}
	
	public void turnUpToEleven(int volume){
		System.out.println("Turn that up to eleven.");
	}
	
	public void getTitle(String title){
		System.out.println("Hey, my name is : " + title);
	}

}
