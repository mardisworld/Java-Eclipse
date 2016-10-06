package _15_Inheritance_Polymorphism;

public class Bear extends Animal {
	
	public Boolean isHibernating;
	
	@Override
	public void speak() {
		System.out.println("ROOOOOOOOOOOAAAAAAAARRRRRR!!");    //This is polymorphism
	}
	
	@Override
	public void foodILike() {
		System.out.println("I like to eat honey and lollipops.");    //This is polymorphism
	}


}
