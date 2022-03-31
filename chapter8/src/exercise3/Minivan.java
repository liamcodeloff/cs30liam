package exercise3;

public class Minivan extends Vehicle {
	
private Boolean slidingDoor;
	
	public Minivan(int dN, String col, int mS, String manf, Boolean slDo) {
		super (dN, col, mS, manf);
		slidingDoor = slDo;
	}
	
	public Boolean getSlidingDoor() {
		return(slidingDoor);
	}
	
	public String hasSlidingDoor() {
		if (slidingDoor == true) {
			return ("Minivan features a sliding door");
		}
		else {
			return("Minivan does not feature a sliding door");
		}
	}

}
