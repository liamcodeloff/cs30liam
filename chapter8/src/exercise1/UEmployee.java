package exercise1;

public class UEmployee {
	private String fullName;
	private Double salary;
	
	public UEmployee(String name, Double sal) {
		fullName = name;
		salary = sal;
		
	}
	public String toString()
    {
        return(fullName + " " + salary);
    }
	
	

}
