package exercise1;

public class Staff extends UEmployee {
private String jobTitle;
	public Staff(String fName, String lName, Double sal, String jb) {
	
		super(fName,lName,sal);
		jobTitle = jb;
	}
	
    public String toString() {
    	return(super.toString() +" "+ jobTitle);
    }
    
    
}
