//import Marissa_car.java;

public class Marissa_Staller_Assessment_2 {

	public static void main(String[] args) {
		//1 
		//Write a for loop that prints from 1-20 by 4s. Print the word twelve when you get to it.
		for (int i=0;i<=20;i++){
				if ((i!=0) && (i%12==0)){
					System.out.println("twelve");
				}
					else {
						if (i%4==0){
						System.out.println(i);
						}
		
					}
				}	

		//2 
		//Create an array of names - Paul, George, John, Ringo.
		//Use a loop, to print the array of names.
		String[] names={"Paul", "George", "John", "Ringo"};
		for (int i2=0; i2<=(names.length-1); i2++)
		{
			System.out.println (names[i2]);
		}

		

		//3 Create a class called Car. Add a property called name. Add a method called makeNoise().
		//Use the class to create a new Car object below. Set the name, print the name, and call the method on the object. 
		//NOTE: You will need to make a separate file to do this. Hit the little plus button by the Main.java file above.
	//Marissa_car.getCar();
		
	
		Marissa_car newCar= new Marissa_car();
		newCar.setName("Ford Thunderbird");
		newCar.setNoise("Vroooommm");
		System.out.println(newCar.getName() + " " + newCar.getNoise());
}
}





	


/*Your console should read this at the end:
0
4
8
Twelve
16
20
Paul
George
John
Ringo
Vroom
Chevy Impala
*/