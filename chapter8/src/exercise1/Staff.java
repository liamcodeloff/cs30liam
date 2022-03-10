package exercise1;

public class Staff extends UEmployee {
private String jobTitle;
	public Staff(String fn, String ln, Integer sal, String jb) {
	
		super(fn, ln,sal);
		jobTitle = jb;
	}
	
    public String toString() {
    	return(super.toString() +" "+ jobTitle);
    }
    
    
}
