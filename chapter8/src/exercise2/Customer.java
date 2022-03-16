package exercise2;

public class Customer {
	private String firstName, lastName, street, city, state, zip, province;
		
	
	public Customer(String fName, String lName, String str, String c, String p, String z) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		province = p;
		zip = z;
	}
	

	 public String toString() {
		String custString;
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + "  " + zip + "\n";
	 	return(custString);
	}
}