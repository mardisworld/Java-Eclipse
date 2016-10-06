package _16_Interfaces;

public class DVD implements IFunctions{
	
	String title;

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("DVD is now playing.");
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("DVD is now stopped.");
		
	}

	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next chapter.");
		
	}

	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Show DVD Menu");
		
	}

	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("DVD is now paused.");
		
	}
	
	public void screenShot(){
		System.out.println("Here is a picture of the movie at this point of time");
	}
	
	public void getTitle(String title){
		System.out.println("Hey, my name is : " + title);
	}


}
