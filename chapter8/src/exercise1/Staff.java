package exercise1;

public class Staff extends UEmployee {
private String jobTitle;
	public Staff(String name, Double sal, String jb) {
	
		super(name,sal);
		jobTitle = jb;
	}
	
    public String toString() {
    	return(super.toString() +" "+ jobTitle);
    }
    
    
}
