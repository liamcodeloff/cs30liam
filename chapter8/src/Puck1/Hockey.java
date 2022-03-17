package Puck1;

public class Hockey {

	public static void main(String[] args) 
	{

		Puck yPuck = new Puck(1.5, 1.0, 4.5);  
		Puck sPuck = new Puck(2.0, 1.5, 5.5);  
		
		System.out.println("The first puck: \n\n" + yPuck.toString(yPuck));
		System.out.println("\nThe second puck: \n\n" + sPuck.toString(sPuck)); 
		
		if (yPuck.equals(sPuck))
		{
			System.out.println("The pucks are equal.");
		}
		else 
		{
			System.out.println("The pucks are not equal.");
		}
	}

	
}
