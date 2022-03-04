package exercise1;

public class UEmployee {
	private String firstName, lastName;
	private Double salary;
	
	public UEmployee(String fName, String lName, Double sal) {
		firstName = fName;
		lastName = lName;
		salary = sal;
		
	}
	public String toString()
    {
        return(firstName+" "+lastName + " " + salary);
    }
	
	

}
