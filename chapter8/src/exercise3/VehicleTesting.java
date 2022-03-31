package exercise3;

import java.util.Scanner;

public class VehicleTesting {
	
	public static void main(String[] args) {
		System.out.println("Enter Vehicle to view: \n Car = 1 \n Minivan = 2 \n Truck = 3");
		Scanner input = new Scanner(System.in);
		int act = input.nextInt();
		
		if (act == 1) {
			Car user = new Car(4, "Purple", 300, "Audi", true);
			System.out.println("Your car has " + user.getDoorsNum() + " doors" + "\nA max speed of " + user.getMaxSpeed()
			+ " kph \nIs manufactured by " + user.getManufacture() + "\n" + user.hasNitrous());

			
		}
		else if (act == 2) {
			Minivan user = new Minivan(4, "Red", 205, "Honda", true );
			System.out.println("Your minivan has " + user.getDoorsNum() + " doors" + "\nA max speed of " + user.getMaxSpeed()
			+ " kph \nIs manufactured by " + user.getManufacture() + "\n" + user.hasSlidingDoor());
			
			
		} else if (act == 3) {
			Truck user = new Truck(6, "Black", 265, "Ford", true);
			System.out.println("Your truck has " + user.getDoorsNum() + " doors" + "\nA max speed of " + user.getMaxSpeed()
			+ " kph \nIs manufactured by " + user.getManufacture() + "\n" + user.isLifted());

			
		} else {
			System.out.println("Invalid input");
		}

		
		
		
	}

}
