package Puck1;

public class Puck extends Disk {

	
	
	
	
	private double weight;
	
	
	public Puck(double r, double t, double w)
	{
		super(r, t); 
		weight = w;
	}
	
	
	public void setWeight(double newWeight) 	
	{
		weight = newWeight;
	}

	
	public double getWeight() 
	{
		return(weight);
	}
	
	
	
	
	public String getDivision(Object p) 
	{
		Puck testPuck = (Puck)p; 
		
		
		
		
		if (testPuck.getWeight() >= 5 && testPuck.getWeight() <= 5.5) 
		{
			return("The puck is standard division");
		} 
		else if (testPuck.getWeight() >= 4 && testPuck.getWeight() <= 4.5)  
		{
			return("The puck is youth division");
		} 
		else 
		{
			return("the puck is a non-standard weight");
		}
	}
	
	
	public boolean equals(Object p) 
	{ 
		Puck testPuck = (Puck)p; 
		if (testPuck.getRadius() == super.getRadius() && testPuck.getThickness() == super.getThickness() && testPuck.getWeight() == weight) 
		{	
			
			
			return true; 
		} 
		else 
		{
			return false; 
		}
	}
	
	
	public String toString(Object p) 
	{
		Puck strPuck = (Puck)p;
		return("The radius of the puck is " + strPuck.getRadius() + ", the thickness is " + strPuck.getThickness() + ", and the weight is " + strPuck.getWeight() + "\n" + getDivision(strPuck));
	}
}

