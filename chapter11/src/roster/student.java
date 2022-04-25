package roster;

public class student {
	private String fName, lName;
	
	public student(String fN,String lN) {
		fName = fN;
		lName = lN;
		
	}

	public String toString() {
		String stuName;
		stuName = fName + " " + lName;
		return(stuName);
		
	}
}
