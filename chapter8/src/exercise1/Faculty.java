package exercise1;

public class Faculty extends UEmployee {
private String deptName;
	public Faculty(String name, Double sal, String d) {
	
		super(name,sal);
		deptName = d;
	}
public String toString() {
	return(super.toString() + " " + deptName);
}
}
