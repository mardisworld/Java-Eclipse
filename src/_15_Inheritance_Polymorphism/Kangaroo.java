package _15_Inheritance_Polymorphism;

public class Kangaroo extends Animal {
	
	public Boolean isMarsupial;
	public Boolean hasJoey;
	public Boolean bigFeet;
	
	
	@Override
	public void speak() {
		System.out.println("I love my little Joey.");    //This is polymorphism because Kangaroo has it and Animal doesn't. Overrides.
	}
	
	@Override
	public void foodILike() {
		System.out.println("I like to eat eucalytis leaves.");    //This is polymorphism because Kangaroo has it and Animal doesn't. 
	}

}
