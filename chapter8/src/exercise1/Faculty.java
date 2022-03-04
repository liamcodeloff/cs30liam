package exercise1;

public class Faculty extends UEmployee {
private String deptName;
	public Faculty(String fName, String lName, Double sal, String d) {
	
		super(fName,lName,sal);
		deptName = d;
	}
public String toString() {
	return(super.toString() + " " + deptName);
}
}
