package exercise1;

public class Faculty extends UEmployee {
/* Extends uemployee class and adds faculty specific variable */
	private String deptName;
	public Faculty(String fn, String ln, Integer sal, String d) {
	
		super(fn, ln,sal);
		deptName = d;
	}
public String toString() {
	return(super.toString() + " " + deptName);
}
}
