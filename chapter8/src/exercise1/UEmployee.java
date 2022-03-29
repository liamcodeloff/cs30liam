package exercise1;

public class UEmployee {
	/* Initializes basic variables for a university employee*/
	private String firstName;
	private String lastName;
	private Integer salary;
	
	public UEmployee(String fn, String ln, Integer sal) {
		firstName = fn;
		lastName = ln;
		salary = sal;
		
	}
	public String toString()
    {
        return(firstName + " " + lastName + " " + salary);
    }
	
	

}
