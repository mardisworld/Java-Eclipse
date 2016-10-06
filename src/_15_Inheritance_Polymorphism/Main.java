package _15_Inheritance_Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Make all new Animals up here in one section. The work below was done showing and highlighting different concepts. Best to declare all at once. 
		
		Animal george=new Animal();
		george.name="George the Animal";
		george.numEyes=2;
		//george.isHibernating is unavailable, because it does not link to Bear class
	
		Bear barney=new Bear();
		barney.name="Barney";
		barney.numEyes=2;
		barney.isHibernating=true;  //links to animal and also to bear, since public class Bear extends Animal

		Kangaroo mama=new Kangaroo();
		mama.name="Mama";
		mama.hasJoey=true;
		mama.isMarsupial=true;
		mama.printName();
		mama.numTeeth=22;
		mama.printNumTeeth();
		mama.habitat="Australia";
		mama.printHabitat();
		//mama.getNumEyes();
		
		mama.speak();	// will print "I am an animal." until it is overridden by Kangaroo speak
		barney.speak(); // will print "I am an animal." until it is overridden by Bear speak
		george.speak(); //will print  "I am an animal."
		
		Mouse minnie= new Mouse();
		minnie.habitat="house";
		
		minnie.disneyContract=true;
		george.foodILike();
		barney.foodILike();
		mama.foodILike();
		minnie.foodILike();
		
		
		
		
		
		
	}

}

//TODO 
//Create a mouse class inside this folder
//Have the Mouse class inherit from animal
//Make the Mouse class use polymorphism to override speak()
//Within Animal create a new method
//Override it within Kangaroo, Mouse,and Bear to make it specific to that type of animal