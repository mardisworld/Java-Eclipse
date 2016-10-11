
public class HomeAppliance {
private String name;
private double price;

//This is my constructor
HomeAppliance(String name, double price){
	this.name=name;
	this.price=price;
}

//These are my getters
public String getName(){
	System.out.println(name);
	return name;
	//can also print value when you call the method to getParameter//
	
}

public double getPrice(){
	System.out.println(price);
	return price;
}


//These are my setters


public void setNewPrice(double newPrice){
	this.price=newPrice;
	System.out.println("The new price is set to : $");
}

}


