package exercise1;

public class Faculty extends UEmployee {
private String deptName;
	public Faculty(String fn, String ln, Double sal, String d) {
	
		super(fn, ln,sal);
		deptName = d;
	}
public String toString() {
	return(super.toString() + " " + deptName);
}
}
