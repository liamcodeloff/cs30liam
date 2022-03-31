package exercise3;

import java.util.Scanner;

public class VehicleTesting {
	
	public static void main(String[] args) {
		Car user = new Car(4, "Purple", 300, "Audi", true);
		Minivan user2 = new Minivan(4, "Red", 205, "Honda", true );
		Truck user3 = new Truck(6, "Black", 265, "Ford", true);
		
		Scanner input = new Scanner(System.in);
		int act = input.nextInt();
		
		System.out.println("Enter Vehicle to view: \n Car = 1 \n Minivan = 2 \n Truck = 3");
	}

}
