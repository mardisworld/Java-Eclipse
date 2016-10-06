package _11_Class_Properties;

public class Car_Objects {

	public static void main(String[] args) {
		//PaulsDreamCar is the object or instance of the Car class. 
		Car paulsDreamCar = new Car();
		paulsDreamCar.make="Tesla"; //.is an operator kind of like + or - or * / or %
		paulsDreamCar.model="Model 3";
		paulsDreamCar.isFast=true;
		paulsDreamCar.milesperCharge=300;
		
		
		//Create your own object for your dream car of type class
		Car marissasDreamCar=new Car();
		marissasDreamCar.make="Porsche";
		marissasDreamCar.year= 2016;
		marissasDreamCar.type= "Hybrid SUV";
		marissasDreamCar.horsepower= 416;
		marissasDreamCar.leatherSeats= true;
		marissasDreamCar.color="black";
		marissasDreamCar.isFast=true;
		marissasDreamCar.marketSegment="Luxury";
		
		//Object number instead of primitive type 
		Integer number=new Integer(5);
		System.out.println(number); //prints 5
		System.out.println(number.getClass());  //prints int value
 		System.out.println(number.toString()); //converts into to type string, still says 5
		
	}

}
