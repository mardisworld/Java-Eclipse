package _16_Interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Create a CD and a DVD object
		//Call some of the methods on those objects.
		
		CD whenThePawn = new CD();
		DVD blackSwan=new DVD();
		
		whenThePawn.play();
		whenThePawn.menu();
		whenThePawn.turnUpToEleven(1);  //this one only for type CD
		whenThePawn.getTitle("When the Pawn");
		
		blackSwan.play();
		blackSwan.stop();
		blackSwan.screenShot();  //this one only for type DVD
		whenThePawn.getTitle("Black Swan");
		
		
		Blu_ray prideAndPredjudice=new Blu_ray();
		prideAndPredjudice.play();
		prideAndPredjudice.pause();
		prideAndPredjudice.playHighQuality();  //this one only for type Blu_Ray
		prideAndPredjudice.getTitle("Pride and Predjudice");
	}

}
