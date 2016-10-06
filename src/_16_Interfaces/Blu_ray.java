package _16_Interfaces;

public class Blu_ray implements IFunctions {

	String title;
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Blu-Ray is now playing.");
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Blu-Ray is now stopped.");
		
	}

	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next Blu-Ray chapter.");
		
	}

	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Show Blu-Ray Menu");
		
	}

	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Blu-Ray is now paused.");
		
	}
	
	public void playHighQuality(){
		System.out.println("This is a high quality Blu-Ray.");
	}
	
	public void getTitle(String title){
		System.out.println("Hey, my name is : " + title);
	}


}
