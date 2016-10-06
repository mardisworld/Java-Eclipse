package _15_Inheritance_Polymorphism;

public class Mouse extends Animal {
	public Boolean scaredOfCats;
	public Boolean disneyContract;
	
	@Override
	public void speak() {
		System.out.println("Minnie in her polka dots, Minnie in her truck!");    //This is polymorphism
	}

	@Override
	public void foodILike() {
		System.out.println("I like to eat cheese and bread crumbs.");    //This is polymorphism
	}
}
