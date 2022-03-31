package exercise3;

public abstract class Vehicle {

	private int doorsNum;
	private String color;
	private int maxSpeed;
	private String manufacture;
	
	public Vehicle(int dN, String col, int mS, String manf) {
		doorsNum = dN;
		color = col;
		maxSpeed = mS;
		manufacture = manf;
	}
	
	public int getDoorsNum() {
		return(doorsNum);
		
	}
	
	public String getColor() {
		return(color);
	}
	
	public int getMaxSpeed() {
		return(maxSpeed);
	}
	public String getManufacture() {
		return(manufacture);
	}
	
}
