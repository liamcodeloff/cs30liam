package exercise3;

public class Car extends Vehicle {
	
	private Boolean nitrous;
	
	public Car(int dN, String col, int mS, String manf, Boolean nos) {
		super (dN, col, mS, manf);
		nitrous = nos;
	}
	
	public Boolean getNitrous() {
		return(nitrous);
	}
	
	public String hasNitrous() {
		if (nitrous == true) {
			return ("Car has nitrous installed");
		}
		else {
			return("Car does not have nitrous installed");
		}
	}

}
