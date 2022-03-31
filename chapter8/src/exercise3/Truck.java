package exercise3;

public class Truck extends Vehicle {
	
private Boolean lifted;
	
	public Truck(int dN, String col, int mS, String manf, Boolean lift) {
		super (dN, col, mS, manf);
		lifted = lift;
	}
	
	public Boolean getLifted() {
		return(lifted);
	}
	
	public String isLifted() {
		if (lifted == true) {
			return ("Truck is lifted");
		}
		else {
			return("Truck is not lifted");
		}
	}

}
