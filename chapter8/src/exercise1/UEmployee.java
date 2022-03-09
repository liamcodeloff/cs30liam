package exercise1;

public class UEmployee {
	private String firstName;
	private String lastName;
	private Double salary;
	
	public UEmployee(String fn, String ln, Double sal) {
		firstName = fn;
		lastName = ln;
		salary = sal;
		
	}
	public String toString()
    {
        return(firstName + " " + lastName + " " + salary);
    }
	
	

}
